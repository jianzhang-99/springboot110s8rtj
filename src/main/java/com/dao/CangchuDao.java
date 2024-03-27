package com.dao;

import com.entity.CangchuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CangchuVO;
import com.entity.view.CangchuView;


/**
 * 仓储
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface CangchuDao extends BaseMapper<CangchuEntity> {
	
	List<CangchuVO> selectListVO(@Param("ew") Wrapper<CangchuEntity> wrapper);
	
	CangchuVO selectVO(@Param("ew") Wrapper<CangchuEntity> wrapper);
	
	List<CangchuView> selectListView(@Param("ew") Wrapper<CangchuEntity> wrapper);

	List<CangchuView> selectListView(Pagination page,@Param("ew") Wrapper<CangchuEntity> wrapper);

	
	CangchuView selectView(@Param("ew") Wrapper<CangchuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CangchuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CangchuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CangchuEntity> wrapper);



}
