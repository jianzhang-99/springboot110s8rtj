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

import com.entity.ShebeixinxiEntity;
import com.entity.view.ShebeixinxiView;

import com.service.ShebeixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 设备信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@RestController
@RequestMapping("/shebeixinxi")
public class ShebeixinxiController {
    @Autowired
    private ShebeixinxiService shebeixinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShebeixinxiEntity shebeixinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			shebeixinxi.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShebeixinxiEntity> ew = new EntityWrapper<ShebeixinxiEntity>();

		PageUtils page = shebeixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShebeixinxiEntity shebeixinxi, 
		HttpServletRequest request){
        EntityWrapper<ShebeixinxiEntity> ew = new EntityWrapper<ShebeixinxiEntity>();

		PageUtils page = shebeixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shebeixinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShebeixinxiEntity shebeixinxi){
       	EntityWrapper<ShebeixinxiEntity> ew = new EntityWrapper<ShebeixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shebeixinxi, "shebeixinxi")); 
        return R.ok().put("data", shebeixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShebeixinxiEntity shebeixinxi){
        EntityWrapper< ShebeixinxiEntity> ew = new EntityWrapper< ShebeixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shebeixinxi, "shebeixinxi")); 
		ShebeixinxiView shebeixinxiView =  shebeixinxiService.selectView(ew);
		return R.ok("查询设备信息成功").put("data", shebeixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShebeixinxiEntity shebeixinxi = shebeixinxiService.selectById(id);
        return R.ok().put("data", shebeixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShebeixinxiEntity shebeixinxi = shebeixinxiService.selectById(id);
        return R.ok().put("data", shebeixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增设备信息") 
    public R save(@RequestBody ShebeixinxiEntity shebeixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shebeixinxi);
        shebeixinxiService.insert(shebeixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增设备信息")
    @RequestMapping("/add")
    public R add(@RequestBody ShebeixinxiEntity shebeixinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shebeixinxi);
        shebeixinxiService.insert(shebeixinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改设备信息")
    public R update(@RequestBody ShebeixinxiEntity shebeixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shebeixinxi);
        shebeixinxiService.updateById(shebeixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除设备信息")
    public R delete(@RequestBody Long[] ids){
        shebeixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
