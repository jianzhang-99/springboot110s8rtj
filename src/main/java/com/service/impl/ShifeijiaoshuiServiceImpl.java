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


import com.dao.ShifeijiaoshuiDao;
import com.entity.ShifeijiaoshuiEntity;
import com.service.ShifeijiaoshuiService;
import com.entity.vo.ShifeijiaoshuiVO;
import com.entity.view.ShifeijiaoshuiView;

@Service("shifeijiaoshuiService")
public class ShifeijiaoshuiServiceImpl extends ServiceImpl<ShifeijiaoshuiDao, ShifeijiaoshuiEntity> implements ShifeijiaoshuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShifeijiaoshuiEntity> page = this.selectPage(
                new Query<ShifeijiaoshuiEntity>(params).getPage(),
                new EntityWrapper<ShifeijiaoshuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShifeijiaoshuiEntity> wrapper) {
		  Page<ShifeijiaoshuiView> page =new Query<ShifeijiaoshuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShifeijiaoshuiVO> selectListVO(Wrapper<ShifeijiaoshuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShifeijiaoshuiVO selectVO(Wrapper<ShifeijiaoshuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShifeijiaoshuiView> selectListView(Wrapper<ShifeijiaoshuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShifeijiaoshuiView selectView(Wrapper<ShifeijiaoshuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
