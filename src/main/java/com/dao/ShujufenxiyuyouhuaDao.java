package com.dao;

import com.entity.ShujufenxiyuyouhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShujufenxiyuyouhuaVO;
import com.entity.view.ShujufenxiyuyouhuaView;


/**
 * 数据分析与优化
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface ShujufenxiyuyouhuaDao extends BaseMapper<ShujufenxiyuyouhuaEntity> {
	
	List<ShujufenxiyuyouhuaVO> selectListVO(@Param("ew") Wrapper<ShujufenxiyuyouhuaEntity> wrapper);
	
	ShujufenxiyuyouhuaVO selectVO(@Param("ew") Wrapper<ShujufenxiyuyouhuaEntity> wrapper);
	
	List<ShujufenxiyuyouhuaView> selectListView(@Param("ew") Wrapper<ShujufenxiyuyouhuaEntity> wrapper);

	List<ShujufenxiyuyouhuaView> selectListView(Pagination page,@Param("ew") Wrapper<ShujufenxiyuyouhuaEntity> wrapper);

	
	ShujufenxiyuyouhuaView selectView(@Param("ew") Wrapper<ShujufenxiyuyouhuaEntity> wrapper);
	

}
