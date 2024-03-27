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

import com.entity.ShengzhangqingkuangEntity;
import com.entity.view.ShengzhangqingkuangView;

import com.service.ShengzhangqingkuangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 生长情况
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@RestController
@RequestMapping("/shengzhangqingkuang")
public class ShengzhangqingkuangController {
    @Autowired
    private ShengzhangqingkuangService shengzhangqingkuangService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShengzhangqingkuangEntity shengzhangqingkuang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			shengzhangqingkuang.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhongzhihu")) {
			shengzhangqingkuang.setZhongzhihuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShengzhangqingkuangEntity> ew = new EntityWrapper<ShengzhangqingkuangEntity>();

		PageUtils page = shengzhangqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shengzhangqingkuang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShengzhangqingkuangEntity shengzhangqingkuang, 
		HttpServletRequest request){
        EntityWrapper<ShengzhangqingkuangEntity> ew = new EntityWrapper<ShengzhangqingkuangEntity>();

		PageUtils page = shengzhangqingkuangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shengzhangqingkuang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShengzhangqingkuangEntity shengzhangqingkuang){
       	EntityWrapper<ShengzhangqingkuangEntity> ew = new EntityWrapper<ShengzhangqingkuangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shengzhangqingkuang, "shengzhangqingkuang")); 
        return R.ok().put("data", shengzhangqingkuangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShengzhangqingkuangEntity shengzhangqingkuang){
        EntityWrapper< ShengzhangqingkuangEntity> ew = new EntityWrapper< ShengzhangqingkuangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shengzhangqingkuang, "shengzhangqingkuang")); 
		ShengzhangqingkuangView shengzhangqingkuangView =  shengzhangqingkuangService.selectView(ew);
		return R.ok("查询生长情况成功").put("data", shengzhangqingkuangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShengzhangqingkuangEntity shengzhangqingkuang = shengzhangqingkuangService.selectById(id);
        return R.ok().put("data", shengzhangqingkuang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShengzhangqingkuangEntity shengzhangqingkuang = shengzhangqingkuangService.selectById(id);
        return R.ok().put("data", shengzhangqingkuang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增生长情况") 
    public R save(@RequestBody ShengzhangqingkuangEntity shengzhangqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shengzhangqingkuang);
        shengzhangqingkuangService.insert(shengzhangqingkuang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增生长情况")
    @RequestMapping("/add")
    public R add(@RequestBody ShengzhangqingkuangEntity shengzhangqingkuang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shengzhangqingkuang);
        shengzhangqingkuangService.insert(shengzhangqingkuang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改生长情况")
    public R update(@RequestBody ShengzhangqingkuangEntity shengzhangqingkuang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shengzhangqingkuang);
        shengzhangqingkuangService.updateById(shengzhangqingkuang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除生长情况")
    public R delete(@RequestBody Long[] ids){
        shengzhangqingkuangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
