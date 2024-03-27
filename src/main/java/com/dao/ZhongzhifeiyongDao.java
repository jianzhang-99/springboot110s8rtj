package com.dao;

import com.entity.ZhongzhifeiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongzhifeiyongVO;
import com.entity.view.ZhongzhifeiyongView;


/**
 * 种植费用
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface ZhongzhifeiyongDao extends BaseMapper<ZhongzhifeiyongEntity> {
	
	List<ZhongzhifeiyongVO> selectListVO(@Param("ew") Wrapper<ZhongzhifeiyongEntity> wrapper);
	
	ZhongzhifeiyongVO selectVO(@Param("ew") Wrapper<ZhongzhifeiyongEntity> wrapper);
	
	List<ZhongzhifeiyongView> selectListView(@Param("ew") Wrapper<ZhongzhifeiyongEntity> wrapper);

	List<ZhongzhifeiyongView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzhifeiyongEntity> wrapper);

	
	ZhongzhifeiyongView selectView(@Param("ew") Wrapper<ZhongzhifeiyongEntity> wrapper);
	

}
