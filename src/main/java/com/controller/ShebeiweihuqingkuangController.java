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

import com.entity.ShebeiweihuqingkuangEntity;
import com.entity.view.ShebeiweihuqingkuangView;

import com.service.ShebeiweihuqingkuangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 设备维护情况
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@RestController
@RequestMapping("/shebeiweihuqingkuang")
public class ShebeiweihuqingkuangController {
    @Autowired
    private ShebeiweihuqingkuangService shebeiweihuqingkuangService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShebeiweihuqingkuangEntity shebeiweihuqingkuang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			shebeiweihuqingkuang.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShebeiweihuqingkuangEntity> ew = new EntityWrapper<ShebeiweihuqingkuangEntity>();

		PageUtils page = shebeiweihuqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeiweihuqingkuang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShebeiweihuqingkuangEntity shebeiweihuqingkuang, 
		HttpServletRequest request){
        EntityWrapper<ShebeiweihuqingkuangEntity> ew = new EntityWrapper<ShebeiweihuqingkuangEntity>();

		PageUtils page = shebeiweihuqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeiweihuqingkuang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShebeiweihuqingkuangEntity shebeiweihuqingkuang){
       	EntityWrapper<ShebeiweihuqingkuangEntity> ew = new EntityWrapper<ShebeiweihuqingkuangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shebeiweihuqingkuang, "shebeiweihuqingkuang")); 
        return R.ok().put("data", shebeiweihuqingkuangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShebeiweihuqingkuangEntity shebeiweihuqingkuang){
        EntityWrapper< ShebeiweihuqingkuangEntity> ew = new EntityWrapper< ShebeiweihuqingkuangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shebeiweihuqingkuang, "shebeiweihuqingkuang")); 
		ShebeiweihuqingkuangView shebeiweihuqingkuangView =  shebeiweihuqingkuangService.selectView(ew);
		return R.ok("查询设备维护情况成功").put("data", shebeiweihuqingkuangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShebeiweihuqingkuangEntity shebeiweihuqingkuang = shebeiweihuqingkuangService.selectById(id);
        return R.ok().put("data", shebeiweihuqingkuang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShebeiweihuqingkuangEntity shebeiweihuqingkuang = shebeiweihuqingkuangService.selectById(id);
        return R.ok().put("data", shebeiweihuqingkuang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增设备维护情况") 
    public R save(@RequestBody ShebeiweihuqingkuangEntity shebeiweihuqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shebeiweihuqingkuang);
        shebeiweihuqingkuangService.insert(shebeiweihuqingkuang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增设备维护情况")
    @RequestMapping("/add")
    public R add(@RequestBody ShebeiweihuqingkuangEntity shebeiweihuqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shebeiweihuqingkuang);
        shebeiweihuqingkuangService.insert(shebeiweihuqingkuang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改设备维护情况")
    public R update(@RequestBody ShebeiweihuqingkuangEntity shebeiweihuqingkuang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeiweihuqingkuang);
        shebeiweihuqingkuangService.updateById(shebeiweihuqingkuang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除设备维护情况")
    public R delete(@RequestBody Long[] ids){
        shebeiweihuqingkuangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
