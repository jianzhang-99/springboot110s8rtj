package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YongpinchukuDao;
import com.entity.YongpinchukuEntity;
import com.service.YongpinchukuService;
import com.entity.vo.YongpinchukuVO;
import com.entity.view.YongpinchukuView;

@Service("yongpinchukuService")
public class YongpinchukuServiceImpl extends ServiceImpl<YongpinchukuDao, YongpinchukuEntity> implements YongpinchukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongpinchukuEntity> page = this.selectPage(
                new Query<YongpinchukuEntity>(params).getPage(),
                new EntityWrapper<YongpinchukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongpinchukuEntity> wrapper) {
		  Page<YongpinchukuView> page =new Query<YongpinchukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YongpinchukuVO> selectListVO(Wrapper<YongpinchukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongpinchukuVO selectVO(Wrapper<YongpinchukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongpinchukuView> selectListView(Wrapper<YongpinchukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongpinchukuView selectView(Wrapper<YongpinchukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
