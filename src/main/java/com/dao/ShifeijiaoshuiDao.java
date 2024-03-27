package com.dao;

import com.entity.ShifeijiaoshuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShifeijiaoshuiVO;
import com.entity.view.ShifeijiaoshuiView;


/**
 * 施肥浇水
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface ShifeijiaoshuiDao extends BaseMapper<ShifeijiaoshuiEntity> {
	
	List<ShifeijiaoshuiVO> selectListVO(@Param("ew") Wrapper<ShifeijiaoshuiEntity> wrapper);
	
	ShifeijiaoshuiVO selectVO(@Param("ew") Wrapper<ShifeijiaoshuiEntity> wrapper);
	
	List<ShifeijiaoshuiView> selectListView(@Param("ew") Wrapper<ShifeijiaoshuiEntity> wrapper);

	List<ShifeijiaoshuiView> selectListView(Pagination page,@Param("ew") Wrapper<ShifeijiaoshuiEntity> wrapper);

	
	ShifeijiaoshuiView selectView(@Param("ew") Wrapper<ShifeijiaoshuiEntity> wrapper);
	

}
