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

import com.entity.ZhiliangjiancehesuyuanEntity;
import com.entity.view.ZhiliangjiancehesuyuanView;

import com.service.ZhiliangjiancehesuyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 质量检测和溯源
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@RestController
@RequestMapping("/zhiliangjiancehesuyuan")
public class ZhiliangjiancehesuyuanController {
    @Autowired
    private ZhiliangjiancehesuyuanService zhiliangjiancehesuyuanService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiliangjiancehesuyuanEntity zhiliangjiancehesuyuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			zhiliangjiancehesuyuan.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhongzhihu")) {
			zhiliangjiancehesuyuan.setZhongzhihuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("nongyejishuyuan")) {
			zhiliangjiancehesuyuan.setJishuyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhiliangjiancehesuyuanEntity> ew = new EntityWrapper<ZhiliangjiancehesuyuanEntity>();

		PageUtils page = zhiliangjiancehesuyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiliangjiancehesuyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiliangjiancehesuyuanEntity zhiliangjiancehesuyuan, 
		HttpServletRequest request){
        EntityWrapper<ZhiliangjiancehesuyuanEntity> ew = new EntityWrapper<ZhiliangjiancehesuyuanEntity>();

		PageUtils page = zhiliangjiancehesuyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiliangjiancehesuyuan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiliangjiancehesuyuanEntity zhiliangjiancehesuyuan){
       	EntityWrapper<ZhiliangjiancehesuyuanEntity> ew = new EntityWrapper<ZhiliangjiancehesuyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiliangjiancehesuyuan, "zhiliangjiancehesuyuan")); 
        return R.ok().put("data", zhiliangjiancehesuyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiliangjiancehesuyuanEntity zhiliangjiancehesuyuan){
        EntityWrapper< ZhiliangjiancehesuyuanEntity> ew = new EntityWrapper< ZhiliangjiancehesuyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiliangjiancehesuyuan, "zhiliangjiancehesuyuan")); 
		ZhiliangjiancehesuyuanView zhiliangjiancehesuyuanView =  zhiliangjiancehesuyuanService.selectView(ew);
		return R.ok("查询质量检测和溯源成功").put("data", zhiliangjiancehesuyuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiliangjiancehesuyuanEntity zhiliangjiancehesuyuan = zhiliangjiancehesuyuanService.selectById(id);
        return R.ok().put("data", zhiliangjiancehesuyuan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiliangjiancehesuyuanEntity zhiliangjiancehesuyuan = zhiliangjiancehesuyuanService.selectById(id);
        return R.ok().put("data", zhiliangjiancehesuyuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增质量检测和溯源") 
    public R save(@RequestBody ZhiliangjiancehesuyuanEntity zhiliangjiancehesuyuan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhiliangjiancehesuyuan);
        zhiliangjiancehesuyuanService.insert(zhiliangjiancehesuyuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增质量检测和溯源")
    @RequestMapping("/add")
    public R add(@RequestBody ZhiliangjiancehesuyuanEntity zhiliangjiancehesuyuan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhiliangjiancehesuyuan);
        zhiliangjiancehesuyuanService.insert(zhiliangjiancehesuyuan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改质量检测和溯源")
    public R update(@RequestBody ZhiliangjiancehesuyuanEntity zhiliangjiancehesuyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiliangjiancehesuyuan);
        zhiliangjiancehesuyuanService.updateById(zhiliangjiancehesuyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除质量检测和溯源")
    public R delete(@RequestBody Long[] ids){
        zhiliangjiancehesuyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
