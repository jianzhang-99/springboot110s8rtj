package com.dao;

import com.entity.TudiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TudiVO;
import com.entity.view.TudiView;


/**
 * 土地
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface TudiDao extends BaseMapper<TudiEntity> {
	
	List<TudiVO> selectListVO(@Param("ew") Wrapper<TudiEntity> wrapper);
	
	TudiVO selectVO(@Param("ew") Wrapper<TudiEntity> wrapper);
	
	List<TudiView> selectListView(@Param("ew") Wrapper<TudiEntity> wrapper);

	List<TudiView> selectListView(Pagination page,@Param("ew") Wrapper<TudiEntity> wrapper);

	
	TudiView selectView(@Param("ew") Wrapper<TudiEntity> wrapper);
	

}
