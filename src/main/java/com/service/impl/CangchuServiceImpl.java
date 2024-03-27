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


import com.dao.CangchuDao;
import com.entity.CangchuEntity;
import com.service.CangchuService;
import com.entity.vo.CangchuVO;
import com.entity.view.CangchuView;

@Service("cangchuService")
public class CangchuServiceImpl extends ServiceImpl<CangchuDao, CangchuEntity> implements CangchuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CangchuEntity> page = this.selectPage(
                new Query<CangchuEntity>(params).getPage(),
                new EntityWrapper<CangchuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CangchuEntity> wrapper) {
		  Page<CangchuView> page =new Query<CangchuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<CangchuVO> selectListVO(Wrapper<CangchuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CangchuVO selectVO(Wrapper<CangchuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CangchuView> selectListView(Wrapper<CangchuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CangchuView selectView(Wrapper<CangchuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CangchuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CangchuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CangchuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
