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


import com.dao.ZuowushiyingxingpingguDao;
import com.entity.ZuowushiyingxingpingguEntity;
import com.service.ZuowushiyingxingpingguService;
import com.entity.vo.ZuowushiyingxingpingguVO;
import com.entity.view.ZuowushiyingxingpingguView;

@Service("zuowushiyingxingpingguService")
public class ZuowushiyingxingpingguServiceImpl extends ServiceImpl<ZuowushiyingxingpingguDao, ZuowushiyingxingpingguEntity> implements ZuowushiyingxingpingguService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuowushiyingxingpingguEntity> page = this.selectPage(
                new Query<ZuowushiyingxingpingguEntity>(params).getPage(),
                new EntityWrapper<ZuowushiyingxingpingguEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuowushiyingxingpingguEntity> wrapper) {
		  Page<ZuowushiyingxingpingguView> page =new Query<ZuowushiyingxingpingguView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZuowushiyingxingpingguVO> selectListVO(Wrapper<ZuowushiyingxingpingguEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuowushiyingxingpingguVO selectVO(Wrapper<ZuowushiyingxingpingguEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuowushiyingxingpingguView> selectListView(Wrapper<ZuowushiyingxingpingguEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuowushiyingxingpingguView selectView(Wrapper<ZuowushiyingxingpingguEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
