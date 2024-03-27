package com.dao;

import com.entity.YongpinrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YongpinrukuVO;
import com.entity.view.YongpinrukuView;


/**
 * 用品入库
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface YongpinrukuDao extends BaseMapper<YongpinrukuEntity> {
	
	List<YongpinrukuVO> selectListVO(@Param("ew") Wrapper<YongpinrukuEntity> wrapper);
	
	YongpinrukuVO selectVO(@Param("ew") Wrapper<YongpinrukuEntity> wrapper);
	
	List<YongpinrukuView> selectListView(@Param("ew") Wrapper<YongpinrukuEntity> wrapper);

	List<YongpinrukuView> selectListView(Pagination page,@Param("ew") Wrapper<YongpinrukuEntity> wrapper);

	
	YongpinrukuView selectView(@Param("ew") Wrapper<YongpinrukuEntity> wrapper);
	

}
