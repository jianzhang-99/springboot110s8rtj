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

import com.entity.ShifeijiaoshuiEntity;
import com.entity.view.ShifeijiaoshuiView;

import com.service.ShifeijiaoshuiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 施肥浇水
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@RestController
@RequestMapping("/shifeijiaoshui")
public class ShifeijiaoshuiController {
    @Autowired
    private ShifeijiaoshuiService shifeijiaoshuiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShifeijiaoshuiEntity shifeijiaoshui,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			shifeijiaoshui.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhongzhihu")) {
			shifeijiaoshui.setZhongzhihuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShifeijiaoshuiEntity> ew = new EntityWrapper<ShifeijiaoshuiEntity>();

		PageUtils page = shifeijiaoshuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shifeijiaoshui), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShifeijiaoshuiEntity shifeijiaoshui, 
		HttpServletRequest request){
        EntityWrapper<ShifeijiaoshuiEntity> ew = new EntityWrapper<ShifeijiaoshuiEntity>();

		PageUtils page = shifeijiaoshuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shifeijiaoshui), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShifeijiaoshuiEntity shifeijiaoshui){
       	EntityWrapper<ShifeijiaoshuiEntity> ew = new EntityWrapper<ShifeijiaoshuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shifeijiaoshui, "shifeijiaoshui")); 
        return R.ok().put("data", shifeijiaoshuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShifeijiaoshuiEntity shifeijiaoshui){
        EntityWrapper< ShifeijiaoshuiEntity> ew = new EntityWrapper< ShifeijiaoshuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shifeijiaoshui, "shifeijiaoshui")); 
		ShifeijiaoshuiView shifeijiaoshuiView =  shifeijiaoshuiService.selectView(ew);
		return R.ok("查询施肥浇水成功").put("data", shifeijiaoshuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShifeijiaoshuiEntity shifeijiaoshui = shifeijiaoshuiService.selectById(id);
        return R.ok().put("data", shifeijiaoshui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShifeijiaoshuiEntity shifeijiaoshui = shifeijiaoshuiService.selectById(id);
        return R.ok().put("data", shifeijiaoshui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增施肥浇水") 
    public R save(@RequestBody ShifeijiaoshuiEntity shifeijiaoshui, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shifeijiaoshui);
        shifeijiaoshuiService.insert(shifeijiaoshui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增施肥浇水")
    @RequestMapping("/add")
    public R add(@RequestBody ShifeijiaoshuiEntity shifeijiaoshui, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shifeijiaoshui);
        shifeijiaoshuiService.insert(shifeijiaoshui);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改施肥浇水")
    public R update(@RequestBody ShifeijiaoshuiEntity shifeijiaoshui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shifeijiaoshui);
        shifeijiaoshuiService.updateById(shifeijiaoshui);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除施肥浇水")
    public R delete(@RequestBody Long[] ids){
        shifeijiaoshuiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
