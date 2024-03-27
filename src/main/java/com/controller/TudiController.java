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

import com.entity.TudiEntity;
import com.entity.view.TudiView;

import com.service.TudiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 土地
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@RestController
@RequestMapping("/tudi")
public class TudiController {
    @Autowired
    private TudiService tudiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TudiEntity tudi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			tudi.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TudiEntity> ew = new EntityWrapper<TudiEntity>();

		PageUtils page = tudiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tudi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TudiEntity tudi, 
		HttpServletRequest request){
        EntityWrapper<TudiEntity> ew = new EntityWrapper<TudiEntity>();

		PageUtils page = tudiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tudi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TudiEntity tudi){
       	EntityWrapper<TudiEntity> ew = new EntityWrapper<TudiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tudi, "tudi")); 
        return R.ok().put("data", tudiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TudiEntity tudi){
        EntityWrapper< TudiEntity> ew = new EntityWrapper< TudiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tudi, "tudi")); 
		TudiView tudiView =  tudiService.selectView(ew);
		return R.ok("查询土地成功").put("data", tudiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TudiEntity tudi = tudiService.selectById(id);
        return R.ok().put("data", tudi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TudiEntity tudi = tudiService.selectById(id);
        return R.ok().put("data", tudi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增土地") 
    public R save(@RequestBody TudiEntity tudi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tudi);
        tudiService.insert(tudi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增土地")
    @RequestMapping("/add")
    public R add(@RequestBody TudiEntity tudi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tudi);
        tudiService.insert(tudi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改土地")
    public R update(@RequestBody TudiEntity tudi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tudi);
        tudiService.updateById(tudi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除土地")
    public R delete(@RequestBody Long[] ids){
        tudiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,TudiEntity tudi, HttpServletRequest request){
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("nongchangzhu")) {
            tudi.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
        }
        EntityWrapper<TudiEntity> ew = new EntityWrapper<TudiEntity>();
        int count = tudiService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tudi), params), params));
        return R.ok().put("data", count);
    }



}
