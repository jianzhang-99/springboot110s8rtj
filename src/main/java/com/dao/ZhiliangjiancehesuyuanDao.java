package com.dao;

import com.entity.ZhiliangjiancehesuyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiliangjiancehesuyuanVO;
import com.entity.view.ZhiliangjiancehesuyuanView;


/**
 * 质量检测和溯源
 * 
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface ZhiliangjiancehesuyuanDao extends BaseMapper<ZhiliangjiancehesuyuanEntity> {
	
	List<ZhiliangjiancehesuyuanVO> selectListVO(@Param("ew") Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);
	
	ZhiliangjiancehesuyuanVO selectVO(@Param("ew") Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);
	
	List<ZhiliangjiancehesuyuanView> selectListView(@Param("ew") Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);

	List<ZhiliangjiancehesuyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);

	
	ZhiliangjiancehesuyuanView selectView(@Param("ew") Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);
	

}
