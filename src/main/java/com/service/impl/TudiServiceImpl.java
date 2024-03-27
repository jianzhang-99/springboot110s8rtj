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


import com.dao.TudiDao;
import com.entity.TudiEntity;
import com.service.TudiService;
import com.entity.vo.TudiVO;
import com.entity.view.TudiView;

@Service("tudiService")
public class TudiServiceImpl extends ServiceImpl<TudiDao, TudiEntity> implements TudiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TudiEntity> page = this.selectPage(
                new Query<TudiEntity>(params).getPage(),
                new EntityWrapper<TudiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TudiEntity> wrapper) {
		  Page<TudiView> page =new Query<TudiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<TudiVO> selectListVO(Wrapper<TudiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TudiVO selectVO(Wrapper<TudiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TudiView> selectListView(Wrapper<TudiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TudiView selectView(Wrapper<TudiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
