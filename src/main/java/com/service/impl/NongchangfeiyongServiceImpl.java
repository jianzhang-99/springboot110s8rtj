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


import com.dao.NongchangfeiyongDao;
import com.entity.NongchangfeiyongEntity;
import com.service.NongchangfeiyongService;
import com.entity.vo.NongchangfeiyongVO;
import com.entity.view.NongchangfeiyongView;

@Service("nongchangfeiyongService")
public class NongchangfeiyongServiceImpl extends ServiceImpl<NongchangfeiyongDao, NongchangfeiyongEntity> implements NongchangfeiyongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchangfeiyongEntity> page = this.selectPage(
                new Query<NongchangfeiyongEntity>(params).getPage(),
                new EntityWrapper<NongchangfeiyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchangfeiyongEntity> wrapper) {
		  Page<NongchangfeiyongView> page =new Query<NongchangfeiyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<NongchangfeiyongVO> selectListVO(Wrapper<NongchangfeiyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchangfeiyongVO selectVO(Wrapper<NongchangfeiyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchangfeiyongView> selectListView(Wrapper<NongchangfeiyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchangfeiyongView selectView(Wrapper<NongchangfeiyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<NongchangfeiyongEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<NongchangfeiyongEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<NongchangfeiyongEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
