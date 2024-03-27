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

import com.entity.ZuowushiyingxingpingguEntity;
import com.entity.view.ZuowushiyingxingpingguView;

import com.service.ZuowushiyingxingpingguService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 作物适应性评估
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@RestController
@RequestMapping("/zuowushiyingxingpinggu")
public class ZuowushiyingxingpingguController {
    @Autowired
    private ZuowushiyingxingpingguService zuowushiyingxingpingguService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuowushiyingxingpingguEntity zuowushiyingxingpinggu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			zuowushiyingxingpinggu.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhongzhihu")) {
			zuowushiyingxingpinggu.setZhongzhihuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("nongyejishuyuan")) {
			zuowushiyingxingpinggu.setJishuyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuowushiyingxingpingguEntity> ew = new EntityWrapper<ZuowushiyingxingpingguEntity>();

		PageUtils page = zuowushiyingxingpingguService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuowushiyingxingpinggu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuowushiyingxingpingguEntity zuowushiyingxingpinggu, 
		HttpServletRequest request){
        EntityWrapper<ZuowushiyingxingpingguEntity> ew = new EntityWrapper<ZuowushiyingxingpingguEntity>();

		PageUtils page = zuowushiyingxingpingguService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuowushiyingxingpinggu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuowushiyingxingpingguEntity zuowushiyingxingpinggu){
       	EntityWrapper<ZuowushiyingxingpingguEntity> ew = new EntityWrapper<ZuowushiyingxingpingguEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuowushiyingxingpinggu, "zuowushiyingxingpinggu")); 
        return R.ok().put("data", zuowushiyingxingpingguService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuowushiyingxingpingguEntity zuowushiyingxingpinggu){
        EntityWrapper< ZuowushiyingxingpingguEntity> ew = new EntityWrapper< ZuowushiyingxingpingguEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuowushiyingxingpinggu, "zuowushiyingxingpinggu")); 
		ZuowushiyingxingpingguView zuowushiyingxingpingguView =  zuowushiyingxingpingguService.selectView(ew);
		return R.ok("查询作物适应性评估成功").put("data", zuowushiyingxingpingguView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuowushiyingxingpingguEntity zuowushiyingxingpinggu = zuowushiyingxingpingguService.selectById(id);
        return R.ok().put("data", zuowushiyingxingpinggu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuowushiyingxingpingguEntity zuowushiyingxingpinggu = zuowushiyingxingpingguService.selectById(id);
        return R.ok().put("data", zuowushiyingxingpinggu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增作物适应性评估") 
    public R save(@RequestBody ZuowushiyingxingpingguEntity zuowushiyingxingpinggu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zuowushiyingxingpinggu);
        zuowushiyingxingpingguService.insert(zuowushiyingxingpinggu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增作物适应性评估")
    @RequestMapping("/add")
    public R add(@RequestBody ZuowushiyingxingpingguEntity zuowushiyingxingpinggu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zuowushiyingxingpinggu);
        zuowushiyingxingpingguService.insert(zuowushiyingxingpinggu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改作物适应性评估")
    public R update(@RequestBody ZuowushiyingxingpingguEntity zuowushiyingxingpinggu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuowushiyingxingpinggu);
        zuowushiyingxingpingguService.updateById(zuowushiyingxingpinggu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除作物适应性评估")
    public R delete(@RequestBody Long[] ids){
        zuowushiyingxingpingguService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
