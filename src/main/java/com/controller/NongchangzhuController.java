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

import com.entity.NongchangzhuEntity;
import com.entity.view.NongchangzhuView;

import com.service.NongchangzhuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 农场主
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@RestController
@RequestMapping("/nongchangzhu")
public class NongchangzhuController {
    @Autowired
    private NongchangzhuService nongchangzhuService;




    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		NongchangzhuEntity u = nongchangzhuService.selectOne(new EntityWrapper<NongchangzhuEntity>().eq("nongchangzhuzhanghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"nongchangzhu",  "农场主" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody NongchangzhuEntity nongchangzhu){
    	//ValidatorUtils.validateEntity(nongchangzhu);
    	NongchangzhuEntity u = nongchangzhuService.selectOne(new EntityWrapper<NongchangzhuEntity>().eq("nongchangzhuzhanghao", nongchangzhu.getNongchangzhuzhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		nongchangzhu.setId(uId);
        nongchangzhuService.insert(nongchangzhu);
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
        NongchangzhuEntity u = nongchangzhuService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	NongchangzhuEntity u = nongchangzhuService.selectOne(new EntityWrapper<NongchangzhuEntity>().eq("nongchangzhuzhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        nongchangzhuService.updateById(u);
        return R.ok("密码已重置为：123456");
    }



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NongchangzhuEntity nongchangzhu,
		HttpServletRequest request){
        EntityWrapper<NongchangzhuEntity> ew = new EntityWrapper<NongchangzhuEntity>();

		PageUtils page = nongchangzhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongchangzhu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NongchangzhuEntity nongchangzhu, 
		HttpServletRequest request){
        EntityWrapper<NongchangzhuEntity> ew = new EntityWrapper<NongchangzhuEntity>();

		PageUtils page = nongchangzhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongchangzhu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NongchangzhuEntity nongchangzhu){
       	EntityWrapper<NongchangzhuEntity> ew = new EntityWrapper<NongchangzhuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nongchangzhu, "nongchangzhu")); 
        return R.ok().put("data", nongchangzhuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NongchangzhuEntity nongchangzhu){
        EntityWrapper< NongchangzhuEntity> ew = new EntityWrapper< NongchangzhuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nongchangzhu, "nongchangzhu")); 
		NongchangzhuView nongchangzhuView =  nongchangzhuService.selectView(ew);
		return R.ok("查询农场主成功").put("data", nongchangzhuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NongchangzhuEntity nongchangzhu = nongchangzhuService.selectById(id);
        return R.ok().put("data", nongchangzhu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NongchangzhuEntity nongchangzhu = nongchangzhuService.selectById(id);
        return R.ok().put("data", nongchangzhu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增农场主") 
    public R save(@RequestBody NongchangzhuEntity nongchangzhu, HttpServletRequest request){
        if(nongchangzhuService.selectCount(new EntityWrapper<NongchangzhuEntity>().eq("nongchangzhuzhanghao", nongchangzhu.getNongchangzhuzhanghao()))>0) {
            return R.error("农场主账号已存在");
        }
    	nongchangzhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongchangzhu);
    	NongchangzhuEntity u = nongchangzhuService.selectOne(new EntityWrapper<NongchangzhuEntity>().eq("nongchangzhuzhanghao", nongchangzhu.getNongchangzhuzhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		nongchangzhu.setId(new Date().getTime());
        nongchangzhuService.insert(nongchangzhu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增农场主")
    @RequestMapping("/add")
    public R add(@RequestBody NongchangzhuEntity nongchangzhu, HttpServletRequest request){
        if(nongchangzhuService.selectCount(new EntityWrapper<NongchangzhuEntity>().eq("nongchangzhuzhanghao", nongchangzhu.getNongchangzhuzhanghao()))>0) {
            return R.error("农场主账号已存在");
        }
    	nongchangzhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongchangzhu);
    	NongchangzhuEntity u = nongchangzhuService.selectOne(new EntityWrapper<NongchangzhuEntity>().eq("nongchangzhuzhanghao", nongchangzhu.getNongchangzhuzhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		nongchangzhu.setId(new Date().getTime());
        nongchangzhuService.insert(nongchangzhu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改农场主")
    public R update(@RequestBody NongchangzhuEntity nongchangzhu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nongchangzhu);
        if(nongchangzhuService.selectCount(new EntityWrapper<NongchangzhuEntity>().ne("id", nongchangzhu.getId()).eq("nongchangzhuzhanghao", nongchangzhu.getNongchangzhuzhanghao()))>0) {
            return R.error("农场主账号已存在");
        }
        nongchangzhuService.updateById(nongchangzhu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除农场主")
    public R delete(@RequestBody Long[] ids){
        nongchangzhuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,NongchangzhuEntity nongchangzhu, HttpServletRequest request){
        EntityWrapper<NongchangzhuEntity> ew = new EntityWrapper<NongchangzhuEntity>();
        int count = nongchangzhuService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongchangzhu), params), params));
        return R.ok().put("data", count);
    }



}
