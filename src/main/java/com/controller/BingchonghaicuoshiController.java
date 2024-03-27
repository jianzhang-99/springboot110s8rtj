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

import com.entity.BingchonghaicuoshiEntity;
import com.entity.view.BingchonghaicuoshiView;

import com.service.BingchonghaicuoshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 病虫害措施
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@RestController
@RequestMapping("/bingchonghaicuoshi")
public class BingchonghaicuoshiController {
    @Autowired
    private BingchonghaicuoshiService bingchonghaicuoshiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BingchonghaicuoshiEntity bingchonghaicuoshi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongyejishuyuan")) {
			bingchonghaicuoshi.setJishuyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BingchonghaicuoshiEntity> ew = new EntityWrapper<BingchonghaicuoshiEntity>();

		PageUtils page = bingchonghaicuoshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bingchonghaicuoshi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BingchonghaicuoshiEntity bingchonghaicuoshi, 
		HttpServletRequest request){
        EntityWrapper<BingchonghaicuoshiEntity> ew = new EntityWrapper<BingchonghaicuoshiEntity>();

		PageUtils page = bingchonghaicuoshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bingchonghaicuoshi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BingchonghaicuoshiEntity bingchonghaicuoshi){
       	EntityWrapper<BingchonghaicuoshiEntity> ew = new EntityWrapper<BingchonghaicuoshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bingchonghaicuoshi, "bingchonghaicuoshi")); 
        return R.ok().put("data", bingchonghaicuoshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BingchonghaicuoshiEntity bingchonghaicuoshi){
        EntityWrapper< BingchonghaicuoshiEntity> ew = new EntityWrapper< BingchonghaicuoshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bingchonghaicuoshi, "bingchonghaicuoshi")); 
		BingchonghaicuoshiView bingchonghaicuoshiView =  bingchonghaicuoshiService.selectView(ew);
		return R.ok("查询病虫害措施成功").put("data", bingchonghaicuoshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BingchonghaicuoshiEntity bingchonghaicuoshi = bingchonghaicuoshiService.selectById(id);
        return R.ok().put("data", bingchonghaicuoshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BingchonghaicuoshiEntity bingchonghaicuoshi = bingchonghaicuoshiService.selectById(id);
        return R.ok().put("data", bingchonghaicuoshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增病虫害措施") 
    public R save(@RequestBody BingchonghaicuoshiEntity bingchonghaicuoshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(bingchonghaicuoshi);
        bingchonghaicuoshiService.insert(bingchonghaicuoshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增病虫害措施")
    @RequestMapping("/add")
    public R add(@RequestBody BingchonghaicuoshiEntity bingchonghaicuoshi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(bingchonghaicuoshi);
        bingchonghaicuoshiService.insert(bingchonghaicuoshi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改病虫害措施")
    public R update(@RequestBody BingchonghaicuoshiEntity bingchonghaicuoshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bingchonghaicuoshi);
        bingchonghaicuoshiService.updateById(bingchonghaicuoshi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除病虫害措施")
    public R delete(@RequestBody Long[] ids){
        bingchonghaicuoshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
