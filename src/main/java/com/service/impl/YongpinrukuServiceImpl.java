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


import com.dao.YongpinrukuDao;
import com.entity.YongpinrukuEntity;
import com.service.YongpinrukuService;
import com.entity.vo.YongpinrukuVO;
import com.entity.view.YongpinrukuView;

@Service("yongpinrukuService")
public class YongpinrukuServiceImpl extends ServiceImpl<YongpinrukuDao, YongpinrukuEntity> implements YongpinrukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongpinrukuEntity> page = this.selectPage(
                new Query<YongpinrukuEntity>(params).getPage(),
                new EntityWrapper<YongpinrukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongpinrukuEntity> wrapper) {
		  Page<YongpinrukuView> page =new Query<YongpinrukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YongpinrukuVO> selectListVO(Wrapper<YongpinrukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongpinrukuVO selectVO(Wrapper<YongpinrukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongpinrukuView> selectListView(Wrapper<YongpinrukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongpinrukuView selectView(Wrapper<YongpinrukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
