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

import com.entity.YongpinrukuEntity;
import com.entity.view.YongpinrukuView;

import com.service.YongpinrukuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 用品入库
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@RestController
@RequestMapping("/yongpinruku")
public class YongpinrukuController {
    @Autowired
    private YongpinrukuService yongpinrukuService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YongpinrukuEntity yongpinruku,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			yongpinruku.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YongpinrukuEntity> ew = new EntityWrapper<YongpinrukuEntity>();

		PageUtils page = yongpinrukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpinruku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YongpinrukuEntity yongpinruku, 
		HttpServletRequest request){
        EntityWrapper<YongpinrukuEntity> ew = new EntityWrapper<YongpinrukuEntity>();

		PageUtils page = yongpinrukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpinruku), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YongpinrukuEntity yongpinruku){
       	EntityWrapper<YongpinrukuEntity> ew = new EntityWrapper<YongpinrukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yongpinruku, "yongpinruku")); 
        return R.ok().put("data", yongpinrukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YongpinrukuEntity yongpinruku){
        EntityWrapper< YongpinrukuEntity> ew = new EntityWrapper< YongpinrukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yongpinruku, "yongpinruku")); 
		YongpinrukuView yongpinrukuView =  yongpinrukuService.selectView(ew);
		return R.ok("查询用品入库成功").put("data", yongpinrukuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YongpinrukuEntity yongpinruku = yongpinrukuService.selectById(id);
        return R.ok().put("data", yongpinruku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YongpinrukuEntity yongpinruku = yongpinrukuService.selectById(id);
        return R.ok().put("data", yongpinruku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增用品入库") 
    public R save(@RequestBody YongpinrukuEntity yongpinruku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yongpinruku);
        yongpinrukuService.insert(yongpinruku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增用品入库")
    @RequestMapping("/add")
    public R add(@RequestBody YongpinrukuEntity yongpinruku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yongpinruku);
        yongpinrukuService.insert(yongpinruku);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改用品入库")
    public R update(@RequestBody YongpinrukuEntity yongpinruku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yongpinruku);
        yongpinrukuService.updateById(yongpinruku);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除用品入库")
    public R delete(@RequestBody Long[] ids){
        yongpinrukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
