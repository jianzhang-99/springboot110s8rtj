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


import com.dao.ShengzhangqingkuangDao;
import com.entity.ShengzhangqingkuangEntity;
import com.service.ShengzhangqingkuangService;
import com.entity.vo.ShengzhangqingkuangVO;
import com.entity.view.ShengzhangqingkuangView;

@Service("shengzhangqingkuangService")
public class ShengzhangqingkuangServiceImpl extends ServiceImpl<ShengzhangqingkuangDao, ShengzhangqingkuangEntity> implements ShengzhangqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengzhangqingkuangEntity> page = this.selectPage(
                new Query<ShengzhangqingkuangEntity>(params).getPage(),
                new EntityWrapper<ShengzhangqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengzhangqingkuangEntity> wrapper) {
		  Page<ShengzhangqingkuangView> page =new Query<ShengzhangqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShengzhangqingkuangVO> selectListVO(Wrapper<ShengzhangqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengzhangqingkuangVO selectVO(Wrapper<ShengzhangqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengzhangqingkuangView> selectListView(Wrapper<ShengzhangqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengzhangqingkuangView selectView(Wrapper<ShengzhangqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
