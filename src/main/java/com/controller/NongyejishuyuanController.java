package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;
import com.annotation.SysLog;

import com.entity.NongyejishuyuanEntity;
import com.entity.view.NongyejishuyuanView;

import com.service.NongyejishuyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 农业技术员
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@RestController
@RequestMapping("/nongyejishuyuan")
public class NongyejishuyuanController {
    @Autowired
    private NongyejishuyuanService nongyejishuyuanService;




    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		NongyejishuyuanEntity u = nongyejishuyuanService.selectOne(new EntityWrapper<NongyejishuyuanEntity>().eq("jishuyuanzhanghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"nongyejishuyuan",  "农业技术员" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody NongyejishuyuanEntity nongyejishuyuan){
    	//ValidatorUtils.validateEntity(nongyejishuyuan);
    	NongyejishuyuanEntity u = nongyejishuyuanService.selectOne(new EntityWrapper<NongyejishuyuanEntity>().eq("jishuyuanzhanghao", nongyejishuyuan.getJishuyuanzhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		nongyejishuyuan.setId(uId);
        nongyejishuyuanService.insert(nongyejishuyuan);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        NongyejishuyuanEntity u = nongyejishuyuanService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	NongyejishuyuanEntity u = nongyejishuyuanService.selectOne(new EntityWrapper<NongyejishuyuanEntity>().eq("jishuyuanzhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        nongyejishuyuanService.updateById(u);
        return R.ok("密码已重置为：123456");
    }



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NongyejishuyuanEntity nongyejishuyuan,
		HttpServletRequest request){
        EntityWrapper<NongyejishuyuanEntity> ew = new EntityWrapper<NongyejishuyuanEntity>();

		PageUtils page = nongyejishuyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongyejishuyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NongyejishuyuanEntity nongyejishuyuan, 
		HttpServletRequest request){
        EntityWrapper<NongyejishuyuanEntity> ew = new EntityWrapper<NongyejishuyuanEntity>();

		PageUtils page = nongyejishuyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongyejishuyuan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NongyejishuyuanEntity nongyejishuyuan){
       	EntityWrapper<NongyejishuyuanEntity> ew = new EntityWrapper<NongyejishuyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nongyejishuyuan, "nongyejishuyuan")); 
        return R.ok().put("data", nongyejishuyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NongyejishuyuanEntity nongyejishuyuan){
        EntityWrapper< NongyejishuyuanEntity> ew = new EntityWrapper< NongyejishuyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nongyejishuyuan, "nongyejishuyuan")); 
		NongyejishuyuanView nongyejishuyuanView =  nongyejishuyuanService.selectView(ew);
		return R.ok("查询农业技术员成功").put("data", nongyejishuyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NongyejishuyuanEntity nongyejishuyuan = nongyejishuyuanService.selectById(id);
        return R.ok().put("data", nongyejishuyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NongyejishuyuanEntity nongyejishuyuan = nongyejishuyuanService.selectById(id);
        return R.ok().put("data", nongyejishuyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增农业技术员") 
    public R save(@RequestBody NongyejishuyuanEntity nongyejishuyuan, HttpServletRequest request){
        if(nongyejishuyuanService.selectCount(new EntityWrapper<NongyejishuyuanEntity>().eq("jishuyuanzhanghao", nongyejishuyuan.getJishuyuanzhanghao()))>0) {
            return R.error("技术员账号已存在");
        }
    	nongyejishuyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongyejishuyuan);
    	NongyejishuyuanEntity u = nongyejishuyuanService.selectOne(new EntityWrapper<NongyejishuyuanEntity>().eq("jishuyuanzhanghao", nongyejishuyuan.getJishuyuanzhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		nongyejishuyuan.setId(new Date().getTime());
        nongyejishuyuanService.insert(nongyejishuyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增农业技术员")
    @RequestMapping("/add")
    public R add(@RequestBody NongyejishuyuanEntity nongyejishuyuan, HttpServletRequest request){
        if(nongyejishuyuanService.selectCount(new EntityWrapper<NongyejishuyuanEntity>().eq("jishuyuanzhanghao", nongyejishuyuan.getJishuyuanzhanghao()))>0) {
            return R.error("技术员账号已存在");
        }
    	nongyejishuyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongyejishuyuan);
    	NongyejishuyuanEntity u = nongyejishuyuanService.selectOne(new EntityWrapper<NongyejishuyuanEntity>().eq("jishuyuanzhanghao", nongyejishuyuan.getJishuyuanzhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		nongyejishuyuan.setId(new Date().getTime());
        nongyejishuyuanService.insert(nongyejishuyuan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改农业技术员")
    public R update(@RequestBody NongyejishuyuanEntity nongyejishuyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nongyejishuyuan);
        if(nongyejishuyuanService.selectCount(new EntityWrapper<NongyejishuyuanEntity>().ne("id", nongyejishuyuan.getId()).eq("jishuyuanzhanghao", nongyejishuyuan.getJishuyuanzhanghao()))>0) {
            return R.error("技术员账号已存在");
        }
        nongyejishuyuanService.updateById(nongyejishuyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除农业技术员")
    public R delete(@RequestBody Long[] ids){
        nongyejishuyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,NongyejishuyuanEntity nongyejishuyuan, HttpServletRequest request){
        EntityWrapper<NongyejishuyuanEntity> ew = new EntityWrapper<NongyejishuyuanEntity>();
        int count = nongyejishuyuanService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongyejishuyuan), params), params));
        return R.ok().put("data", count);
    }



}
