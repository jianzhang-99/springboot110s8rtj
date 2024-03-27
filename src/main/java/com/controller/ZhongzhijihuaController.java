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

import com.entity.ZhongzhijihuaEntity;
import com.entity.view.ZhongzhijihuaView;

import com.service.ZhongzhijihuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 种植计划
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@RestController
@RequestMapping("/zhongzhijihua")
public class ZhongzhijihuaController {
    @Autowired
    private ZhongzhijihuaService zhongzhijihuaService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhongzhijihuaEntity zhongzhijihua,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongyejishuyuan")) {
			zhongzhijihua.setJishuyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhongzhijihuaEntity> ew = new EntityWrapper<ZhongzhijihuaEntity>();

		PageUtils page = zhongzhijihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhijihua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhongzhijihuaEntity zhongzhijihua, 
		HttpServletRequest request){
        EntityWrapper<ZhongzhijihuaEntity> ew = new EntityWrapper<ZhongzhijihuaEntity>();

		PageUtils page = zhongzhijihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhijihua), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhongzhijihuaEntity zhongzhijihua){
       	EntityWrapper<ZhongzhijihuaEntity> ew = new EntityWrapper<ZhongzhijihuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhongzhijihua, "zhongzhijihua")); 
        return R.ok().put("data", zhongzhijihuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhongzhijihuaEntity zhongzhijihua){
        EntityWrapper< ZhongzhijihuaEntity> ew = new EntityWrapper< ZhongzhijihuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhongzhijihua, "zhongzhijihua")); 
		ZhongzhijihuaView zhongzhijihuaView =  zhongzhijihuaService.selectView(ew);
		return R.ok("查询种植计划成功").put("data", zhongzhijihuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhongzhijihuaEntity zhongzhijihua = zhongzhijihuaService.selectById(id);
		zhongzhijihua.setClicknum(zhongzhijihua.getClicknum()+1);
		zhongzhijihua.setClicktime(new Date());
		zhongzhijihuaService.updateById(zhongzhijihua);
        zhongzhijihua = zhongzhijihuaService.selectView(new EntityWrapper<ZhongzhijihuaEntity>().eq("id", id));
        return R.ok().put("data", zhongzhijihua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhongzhijihuaEntity zhongzhijihua = zhongzhijihuaService.selectById(id);
		zhongzhijihua.setClicknum(zhongzhijihua.getClicknum()+1);
		zhongzhijihua.setClicktime(new Date());
		zhongzhijihuaService.updateById(zhongzhijihua);
        zhongzhijihua = zhongzhijihuaService.selectView(new EntityWrapper<ZhongzhijihuaEntity>().eq("id", id));
        return R.ok().put("data", zhongzhijihua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增种植计划") 
    public R save(@RequestBody ZhongzhijihuaEntity zhongzhijihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhongzhijihua);
        zhongzhijihuaService.insert(zhongzhijihua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增种植计划")
    @RequestMapping("/add")
    public R add(@RequestBody ZhongzhijihuaEntity zhongzhijihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zhongzhijihua);
        zhongzhijihuaService.insert(zhongzhijihua);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改种植计划")
    public R update(@RequestBody ZhongzhijihuaEntity zhongzhijihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhongzhijihua);
        zhongzhijihuaService.updateById(zhongzhijihua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除种植计划")
    public R delete(@RequestBody Long[] ids){
        zhongzhijihuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ZhongzhijihuaEntity zhongzhijihua, HttpServletRequest request,String pre){
        EntityWrapper<ZhongzhijihuaEntity> ew = new EntityWrapper<ZhongzhijihuaEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = zhongzhijihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhongzhijihua), params), params));
        return R.ok().put("data", page);
    }










}
