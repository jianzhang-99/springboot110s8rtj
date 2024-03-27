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


import com.dao.BingchonghaicuoshiDao;
import com.entity.BingchonghaicuoshiEntity;
import com.service.BingchonghaicuoshiService;
import com.entity.vo.BingchonghaicuoshiVO;
import com.entity.view.BingchonghaicuoshiView;

@Service("bingchonghaicuoshiService")
public class BingchonghaicuoshiServiceImpl extends ServiceImpl<BingchonghaicuoshiDao, BingchonghaicuoshiEntity> implements BingchonghaicuoshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingchonghaicuoshiEntity> page = this.selectPage(
                new Query<BingchonghaicuoshiEntity>(params).getPage(),
                new EntityWrapper<BingchonghaicuoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingchonghaicuoshiEntity> wrapper) {
		  Page<BingchonghaicuoshiView> page =new Query<BingchonghaicuoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BingchonghaicuoshiVO> selectListVO(Wrapper<BingchonghaicuoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingchonghaicuoshiVO selectVO(Wrapper<BingchonghaicuoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingchonghaicuoshiView> selectListView(Wrapper<BingchonghaicuoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingchonghaicuoshiView selectView(Wrapper<BingchonghaicuoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
