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


import com.dao.BingchonghaifangzhiDao;
import com.entity.BingchonghaifangzhiEntity;
import com.service.BingchonghaifangzhiService;
import com.entity.vo.BingchonghaifangzhiVO;
import com.entity.view.BingchonghaifangzhiView;

@Service("bingchonghaifangzhiService")
public class BingchonghaifangzhiServiceImpl extends ServiceImpl<BingchonghaifangzhiDao, BingchonghaifangzhiEntity> implements BingchonghaifangzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingchonghaifangzhiEntity> page = this.selectPage(
                new Query<BingchonghaifangzhiEntity>(params).getPage(),
                new EntityWrapper<BingchonghaifangzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingchonghaifangzhiEntity> wrapper) {
		  Page<BingchonghaifangzhiView> page =new Query<BingchonghaifangzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BingchonghaifangzhiVO> selectListVO(Wrapper<BingchonghaifangzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingchonghaifangzhiVO selectVO(Wrapper<BingchonghaifangzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingchonghaifangzhiView> selectListView(Wrapper<BingchonghaifangzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingchonghaifangzhiView selectView(Wrapper<BingchonghaifangzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<BingchonghaifangzhiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<BingchonghaifangzhiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<BingchonghaifangzhiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
