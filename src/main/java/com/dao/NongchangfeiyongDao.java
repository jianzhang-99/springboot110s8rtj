package com.dao;

import com.entity.NongchangfeiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchangfeiyongVO;
import com.entity.view.NongchangfeiyongView;


/**
 * 农场费用
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface NongchangfeiyongDao extends BaseMapper<NongchangfeiyongEntity> {
	
	List<NongchangfeiyongVO> selectListVO(@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);
	
	NongchangfeiyongVO selectVO(@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);
	
	List<NongchangfeiyongView> selectListView(@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);

	List<NongchangfeiyongView> selectListView(Pagination page,@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);

	
	NongchangfeiyongView selectView(@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);



}
