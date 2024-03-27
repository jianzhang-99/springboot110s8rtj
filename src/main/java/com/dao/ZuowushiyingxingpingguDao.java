package com.dao;

import com.entity.ZuowushiyingxingpingguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuowushiyingxingpingguVO;
import com.entity.view.ZuowushiyingxingpingguView;


/**
 * 作物适应性评估
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface ZuowushiyingxingpingguDao extends BaseMapper<ZuowushiyingxingpingguEntity> {
	
	List<ZuowushiyingxingpingguVO> selectListVO(@Param("ew") Wrapper<ZuowushiyingxingpingguEntity> wrapper);
	
	ZuowushiyingxingpingguVO selectVO(@Param("ew") Wrapper<ZuowushiyingxingpingguEntity> wrapper);
	
	List<ZuowushiyingxingpingguView> selectListView(@Param("ew") Wrapper<ZuowushiyingxingpingguEntity> wrapper);

	List<ZuowushiyingxingpingguView> selectListView(Pagination page,@Param("ew") Wrapper<ZuowushiyingxingpingguEntity> wrapper);

	
	ZuowushiyingxingpingguView selectView(@Param("ew") Wrapper<ZuowushiyingxingpingguEntity> wrapper);
	

}
