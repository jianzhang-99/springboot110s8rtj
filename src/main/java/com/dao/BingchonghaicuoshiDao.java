package com.dao;

import com.entity.BingchonghaicuoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingchonghaicuoshiVO;
import com.entity.view.BingchonghaicuoshiView;


/**
 * 病虫害措施
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface BingchonghaicuoshiDao extends BaseMapper<BingchonghaicuoshiEntity> {
	
	List<BingchonghaicuoshiVO> selectListVO(@Param("ew") Wrapper<BingchonghaicuoshiEntity> wrapper);
	
	BingchonghaicuoshiVO selectVO(@Param("ew") Wrapper<BingchonghaicuoshiEntity> wrapper);
	
	List<BingchonghaicuoshiView> selectListView(@Param("ew") Wrapper<BingchonghaicuoshiEntity> wrapper);

	List<BingchonghaicuoshiView> selectListView(Pagination page,@Param("ew") Wrapper<BingchonghaicuoshiEntity> wrapper);

	
	BingchonghaicuoshiView selectView(@Param("ew") Wrapper<BingchonghaicuoshiEntity> wrapper);
	

}
