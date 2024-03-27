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


import com.dao.ZhongzhifeiyongDao;
import com.entity.ZhongzhifeiyongEntity;
import com.service.ZhongzhifeiyongService;
import com.entity.vo.ZhongzhifeiyongVO;
import com.entity.view.ZhongzhifeiyongView;

@Service("zhongzhifeiyongService")
public class ZhongzhifeiyongServiceImpl extends ServiceImpl<ZhongzhifeiyongDao, ZhongzhifeiyongEntity> implements ZhongzhifeiyongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzhifeiyongEntity> page = this.selectPage(
                new Query<ZhongzhifeiyongEntity>(params).getPage(),
                new EntityWrapper<ZhongzhifeiyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzhifeiyongEntity> wrapper) {
		  Page<ZhongzhifeiyongView> page =new Query<ZhongzhifeiyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhongzhifeiyongVO> selectListVO(Wrapper<ZhongzhifeiyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongzhifeiyongVO selectVO(Wrapper<ZhongzhifeiyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongzhifeiyongView> selectListView(Wrapper<ZhongzhifeiyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzhifeiyongView selectView(Wrapper<ZhongzhifeiyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
