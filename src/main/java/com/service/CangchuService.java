package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CangchuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CangchuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CangchuView;


/**
 * 仓储
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface CangchuService extends IService<CangchuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CangchuVO> selectListVO(Wrapper<CangchuEntity> wrapper);
   	
   	CangchuVO selectVO(@Param("ew") Wrapper<CangchuEntity> wrapper);
   	
   	List<CangchuView> selectListView(Wrapper<CangchuEntity> wrapper);
   	
   	CangchuView selectView(@Param("ew") Wrapper<CangchuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CangchuEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CangchuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CangchuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CangchuEntity> wrapper);



}

