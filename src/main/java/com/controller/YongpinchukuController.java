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

import com.entity.YongpinchukuEntity;
import com.entity.view.YongpinchukuView;

import com.service.YongpinchukuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 用品出库
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@RestController
@RequestMapping("/yongpinchuku")
public class YongpinchukuController {
    @Autowired
    private YongpinchukuService yongpinchukuService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YongpinchukuEntity yongpinchuku,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			yongpinchuku.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YongpinchukuEntity> ew = new EntityWrapper<YongpinchukuEntity>();

		PageUtils page = yongpinchukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpinchuku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YongpinchukuEntity yongpinchuku, 
		HttpServletRequest request){
        EntityWrapper<YongpinchukuEntity> ew = new EntityWrapper<YongpinchukuEntity>();

		PageUtils page = yongpinchukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yongpinchuku), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YongpinchukuEntity yongpinchuku){
       	EntityWrapper<YongpinchukuEntity> ew = new EntityWrapper<YongpinchukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yongpinchuku, "yongpinchuku")); 
        return R.ok().put("data", yongpinchukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YongpinchukuEntity yongpinchuku){
        EntityWrapper< YongpinchukuEntity> ew = new EntityWrapper< YongpinchukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yongpinchuku, "yongpinchuku")); 
		YongpinchukuView yongpinchukuView =  yongpinchukuService.selectView(ew);
		return R.ok("查询用品出库成功").put("data", yongpinchukuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YongpinchukuEntity yongpinchuku = yongpinchukuService.selectById(id);
        return R.ok().put("data", yongpinchuku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YongpinchukuEntity yongpinchuku = yongpinchukuService.selectById(id);
        return R.ok().put("data", yongpinchuku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增用品出库") 
    public R save(@RequestBody YongpinchukuEntity yongpinchuku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yongpinchuku);
        yongpinchukuService.insert(yongpinchuku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增用品出库")
    @RequestMapping("/add")
    public R add(@RequestBody YongpinchukuEntity yongpinchuku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yongpinchuku);
        yongpinchukuService.insert(yongpinchuku);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改用品出库")
    public R update(@RequestBody YongpinchukuEntity yongpinchuku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yongpinchuku);
        yongpinchukuService.updateById(yongpinchuku);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除用品出库")
    public R delete(@RequestBody Long[] ids){
        yongpinchukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
