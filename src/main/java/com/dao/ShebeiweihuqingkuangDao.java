package com.dao;

import com.entity.ShebeiweihuqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeiweihuqingkuangVO;
import com.entity.view.ShebeiweihuqingkuangView;


/**
 * 设备维护情况
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface ShebeiweihuqingkuangDao extends BaseMapper<ShebeiweihuqingkuangEntity> {
	
	List<ShebeiweihuqingkuangVO> selectListVO(@Param("ew") Wrapper<ShebeiweihuqingkuangEntity> wrapper);
	
	ShebeiweihuqingkuangVO selectVO(@Param("ew") Wrapper<ShebeiweihuqingkuangEntity> wrapper);
	
	List<ShebeiweihuqingkuangView> selectListView(@Param("ew") Wrapper<ShebeiweihuqingkuangEntity> wrapper);

	List<ShebeiweihuqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeiweihuqingkuangEntity> wrapper);

	
	ShebeiweihuqingkuangView selectView(@Param("ew") Wrapper<ShebeiweihuqingkuangEntity> wrapper);
	

}
