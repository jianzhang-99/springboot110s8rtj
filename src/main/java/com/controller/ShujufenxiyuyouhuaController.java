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

import com.entity.ShujufenxiyuyouhuaEntity;
import com.entity.view.ShujufenxiyuyouhuaView;

import com.service.ShujufenxiyuyouhuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 数据分析与优化
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@RestController
@RequestMapping("/shujufenxiyuyouhua")
public class ShujufenxiyuyouhuaController {
    @Autowired
    private ShujufenxiyuyouhuaService shujufenxiyuyouhuaService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShujufenxiyuyouhuaEntity shujufenxiyuyouhua,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			shujufenxiyuyouhua.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhongzhihu")) {
			shujufenxiyuyouhua.setZhongzhihuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("nongyejishuyuan")) {
			shujufenxiyuyouhua.setJishuyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShujufenxiyuyouhuaEntity> ew = new EntityWrapper<ShujufenxiyuyouhuaEntity>();

		PageUtils page = shujufenxiyuyouhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shujufenxiyuyouhua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShujufenxiyuyouhuaEntity shujufenxiyuyouhua, 
		HttpServletRequest request){
        EntityWrapper<ShujufenxiyuyouhuaEntity> ew = new EntityWrapper<ShujufenxiyuyouhuaEntity>();

		PageUtils page = shujufenxiyuyouhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shujufenxiyuyouhua), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShujufenxiyuyouhuaEntity shujufenxiyuyouhua){
       	EntityWrapper<ShujufenxiyuyouhuaEntity> ew = new EntityWrapper<ShujufenxiyuyouhuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shujufenxiyuyouhua, "shujufenxiyuyouhua")); 
        return R.ok().put("data", shujufenxiyuyouhuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShujufenxiyuyouhuaEntity shujufenxiyuyouhua){
        EntityWrapper< ShujufenxiyuyouhuaEntity> ew = new EntityWrapper< ShujufenxiyuyouhuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shujufenxiyuyouhua, "shujufenxiyuyouhua")); 
		ShujufenxiyuyouhuaView shujufenxiyuyouhuaView =  shujufenxiyuyouhuaService.selectView(ew);
		return R.ok("查询数据分析与优化成功").put("data", shujufenxiyuyouhuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShujufenxiyuyouhuaEntity shujufenxiyuyouhua = shujufenxiyuyouhuaService.selectById(id);
        return R.ok().put("data", shujufenxiyuyouhua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShujufenxiyuyouhuaEntity shujufenxiyuyouhua = shujufenxiyuyouhuaService.selectById(id);
        return R.ok().put("data", shujufenxiyuyouhua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增数据分析与优化") 
    public R save(@RequestBody ShujufenxiyuyouhuaEntity shujufenxiyuyouhua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shujufenxiyuyouhua);
        shujufenxiyuyouhuaService.insert(shujufenxiyuyouhua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增数据分析与优化")
    @RequestMapping("/add")
    public R add(@RequestBody ShujufenxiyuyouhuaEntity shujufenxiyuyouhua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shujufenxiyuyouhua);
        shujufenxiyuyouhuaService.insert(shujufenxiyuyouhua);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改数据分析与优化")
    public R update(@RequestBody ShujufenxiyuyouhuaEntity shujufenxiyuyouhua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shujufenxiyuyouhua);
        shujufenxiyuyouhuaService.updateById(shujufenxiyuyouhua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除数据分析与优化")
    public R delete(@RequestBody Long[] ids){
        shujufenxiyuyouhuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
