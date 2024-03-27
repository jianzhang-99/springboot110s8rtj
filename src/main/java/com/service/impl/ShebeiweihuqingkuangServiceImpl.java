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


import com.dao.ShebeiweihuqingkuangDao;
import com.entity.ShebeiweihuqingkuangEntity;
import com.service.ShebeiweihuqingkuangService;
import com.entity.vo.ShebeiweihuqingkuangVO;
import com.entity.view.ShebeiweihuqingkuangView;

@Service("shebeiweihuqingkuangService")
public class ShebeiweihuqingkuangServiceImpl extends ServiceImpl<ShebeiweihuqingkuangDao, ShebeiweihuqingkuangEntity> implements ShebeiweihuqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeiweihuqingkuangEntity> page = this.selectPage(
                new Query<ShebeiweihuqingkuangEntity>(params).getPage(),
                new EntityWrapper<ShebeiweihuqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeiweihuqingkuangEntity> wrapper) {
		  Page<ShebeiweihuqingkuangView> page =new Query<ShebeiweihuqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShebeiweihuqingkuangVO> selectListVO(Wrapper<ShebeiweihuqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeiweihuqingkuangVO selectVO(Wrapper<ShebeiweihuqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeiweihuqingkuangView> selectListView(Wrapper<ShebeiweihuqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeiweihuqingkuangView selectView(Wrapper<ShebeiweihuqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
