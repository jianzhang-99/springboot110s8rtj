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

import com.entity.BingchonghaifangzhiEntity;
import com.entity.view.BingchonghaifangzhiView;

import com.service.BingchonghaifangzhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 病虫害防治
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@RestController
@RequestMapping("/bingchonghaifangzhi")
public class BingchonghaifangzhiController {
    @Autowired
    private BingchonghaifangzhiService bingchonghaifangzhiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BingchonghaifangzhiEntity bingchonghaifangzhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
			bingchonghaifangzhi.setNongchangzhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhongzhihu")) {
			bingchonghaifangzhi.setZhongzhihuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BingchonghaifangzhiEntity> ew = new EntityWrapper<BingchonghaifangzhiEntity>();

		PageUtils page = bingchonghaifangzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bingchonghaifangzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BingchonghaifangzhiEntity bingchonghaifangzhi, 
		HttpServletRequest request){
        EntityWrapper<BingchonghaifangzhiEntity> ew = new EntityWrapper<BingchonghaifangzhiEntity>();

		PageUtils page = bingchonghaifangzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bingchonghaifangzhi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BingchonghaifangzhiEntity bingchonghaifangzhi){
       	EntityWrapper<BingchonghaifangzhiEntity> ew = new EntityWrapper<BingchonghaifangzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bingchonghaifangzhi, "bingchonghaifangzhi")); 
        return R.ok().put("data", bingchonghaifangzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BingchonghaifangzhiEntity bingchonghaifangzhi){
        EntityWrapper< BingchonghaifangzhiEntity> ew = new EntityWrapper< BingchonghaifangzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bingchonghaifangzhi, "bingchonghaifangzhi")); 
		BingchonghaifangzhiView bingchonghaifangzhiView =  bingchonghaifangzhiService.selectView(ew);
		return R.ok("查询病虫害防治成功").put("data", bingchonghaifangzhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BingchonghaifangzhiEntity bingchonghaifangzhi = bingchonghaifangzhiService.selectById(id);
        return R.ok().put("data", bingchonghaifangzhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BingchonghaifangzhiEntity bingchonghaifangzhi = bingchonghaifangzhiService.selectById(id);
        return R.ok().put("data", bingchonghaifangzhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增病虫害防治") 
    public R save(@RequestBody BingchonghaifangzhiEntity bingchonghaifangzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(bingchonghaifangzhi);
        bingchonghaifangzhiService.insert(bingchonghaifangzhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增病虫害防治")
    @RequestMapping("/add")
    public R add(@RequestBody BingchonghaifangzhiEntity bingchonghaifangzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(bingchonghaifangzhi);
        bingchonghaifangzhiService.insert(bingchonghaifangzhi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改病虫害防治")
    public R update(@RequestBody BingchonghaifangzhiEntity bingchonghaifangzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bingchonghaifangzhi);
        bingchonghaifangzhiService.updateById(bingchonghaifangzhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除病虫害防治")
    public R delete(@RequestBody Long[] ids){
        bingchonghaifangzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	






    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<BingchonghaifangzhiEntity> ew = new EntityWrapper<BingchonghaifangzhiEntity>();
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nongchangzhu")) {
            ew.eq("nongchangzhuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhongzhihu")) {
            ew.eq("zhongzhihuzhanghao", (String)request.getSession().getAttribute("username"));
		}
        List<Map<String, Object>> result = bingchonghaifangzhiService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计(多)）
     */
    @RequestMapping("/valueMul/{xColumnName}")
    public R valueMul(@PathVariable("xColumnName") String xColumnName,@RequestParam String yColumnNameMul, HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<BingchonghaifangzhiEntity> ew = new EntityWrapper<BingchonghaifangzhiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("nongchangzhu")) {
            ew.eq("nongchangzhuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("zhongzhihu")) {
            ew.eq("zhongzhihuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = bingchonghaifangzhiService.selectValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<BingchonghaifangzhiEntity> ew = new EntityWrapper<BingchonghaifangzhiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("nongchangzhu")) {
            ew.eq("nongchangzhuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("zhongzhihu")) {
            ew.eq("zhongzhihuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = bingchonghaifangzhiService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型(多)
     */
    @RequestMapping("/valueMul/{xColumnName}/{timeStatType}")
    public R valueMulDay(@PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,@RequestParam String yColumnNameMul,HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("timeStatType", timeStatType);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<BingchonghaifangzhiEntity> ew = new EntityWrapper<BingchonghaifangzhiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("nongchangzhu")) {
            ew.eq("nongchangzhuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("zhongzhihu")) {
            ew.eq("zhongzhihuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = bingchonghaifangzhiService.selectTimeStatValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<BingchonghaifangzhiEntity> ew = new EntityWrapper<BingchonghaifangzhiEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("nongchangzhu")) {
            ew.eq("nongchangzhuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("zhongzhihu")) {
            ew.eq("zhongzhihuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = bingchonghaifangzhiService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }







}
