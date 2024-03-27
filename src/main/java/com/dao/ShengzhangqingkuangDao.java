package com.dao;

import com.entity.ShengzhangqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengzhangqingkuangVO;
import com.entity.view.ShengzhangqingkuangView;


/**
 * 生长情况
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface ShengzhangqingkuangDao extends BaseMapper<ShengzhangqingkuangEntity> {
	
	List<ShengzhangqingkuangVO> selectListVO(@Param("ew") Wrapper<ShengzhangqingkuangEntity> wrapper);
	
	ShengzhangqingkuangVO selectVO(@Param("ew") Wrapper<ShengzhangqingkuangEntity> wrapper);
	
	List<ShengzhangqingkuangView> selectListView(@Param("ew") Wrapper<ShengzhangqingkuangEntity> wrapper);

	List<ShengzhangqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<ShengzhangqingkuangEntity> wrapper);

	
	ShengzhangqingkuangView selectView(@Param("ew") Wrapper<ShengzhangqingkuangEntity> wrapper);
	

}
