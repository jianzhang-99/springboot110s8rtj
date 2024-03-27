package com.dao;

import com.entity.YongpinchukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongpinchukuVO;
import com.entity.view.YongpinchukuView;


/**
 * 用品出库
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface YongpinchukuDao extends BaseMapper<YongpinchukuEntity> {
	
	List<YongpinchukuVO> selectListVO(@Param("ew") Wrapper<YongpinchukuEntity> wrapper);
	
	YongpinchukuVO selectVO(@Param("ew") Wrapper<YongpinchukuEntity> wrapper);
	
	List<YongpinchukuView> selectListView(@Param("ew") Wrapper<YongpinchukuEntity> wrapper);

	List<YongpinchukuView> selectListView(Pagination page,@Param("ew") Wrapper<YongpinchukuEntity> wrapper);

	
	YongpinchukuView selectView(@Param("ew") Wrapper<YongpinchukuEntity> wrapper);
	

}
