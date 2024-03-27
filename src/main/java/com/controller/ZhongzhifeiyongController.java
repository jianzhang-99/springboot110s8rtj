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

import com.entity.ZhongzhifeiyongEntity;
import com.entity.view.ZhongzhifeiyongView;

import com.service.ZhongzhifeiyongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 种植费用
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@RestController
@RequestMapping("/zhongzhifeiyong")
public class ZhongzhifeiyongController {
    @Autowired
    private ZhongzhifeiyongService zhongzhifeiyongService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhongzhifeiyongEntity zhongzhifeiyong,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhongzhihu")) {
			zhongzhifeiyong.setZhongzhihuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhongzhifeiyongEntity> ew = new EntityWrapper<ZhongzhifeiyongEntity>();

		PageUtils page = zhongzhifeiyongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhifeiyong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhongzhifeiyongEntity zhongzhifeiyong, 
		HttpServletRequest request){
        EntityWrapper<ZhongzhifeiyongEntity> ew = new EntityWrapper<ZhongzhifeiyongEntity>();

		PageUtils page = zhongzhifeiyongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhifeiyong), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhongzhifeiyongEntity zhongzhifeiyong){
       	EntityWrapper<ZhongzhifeiyongEntity> ew = new EntityWrapper<ZhongzhifeiyongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhongzhifeiyong, "zhongzhifeiyong")); 
        return R.ok().put("data", zhongzhifeiyongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhongzhifeiyongEntity zhongzhifeiyong){
        EntityWrapper< ZhongzhifeiyongEntity> ew = new EntityWrapper< ZhongzhifeiyongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhongzhifeiyong, "zhongzhifeiyong")); 
		ZhongzhifeiyongView zhongzhifeiyongView =  zhongzhifeiyongService.selectView(ew);
		return R.ok("查询种植费用成功").put("data", zhongzhifeiyongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhongzhifeiyongEntity zhongzhifeiyong = zhongzhifeiyongService.selectById(id);
        return R.ok().put("data", zhongzhifeiyong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhongzhifeiyongEntity zhongzhifeiyong = zhongzhifeiyongService.selectById(id);
        return R.ok().put("data", zhongzhifeiyong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增种植费用") 
    public R save(@RequestBody ZhongzhifeiyongEntity zhongzhifeiyong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhongzhifeiyong);
        zhongzhifeiyongService.insert(zhongzhifeiyong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增种植费用")
    @RequestMapping("/add")
    public R add(@RequestBody ZhongzhifeiyongEntity zhongzhifeiyong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhongzhifeiyong);
        zhongzhifeiyongService.insert(zhongzhifeiyong);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改种植费用")
    public R update(@RequestBody ZhongzhifeiyongEntity zhongzhifeiyong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhongzhifeiyong);
        zhongzhifeiyongService.updateById(zhongzhifeiyong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除种植费用")
    public R delete(@RequestBody Long[] ids){
        zhongzhifeiyongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
