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


import com.dao.ShujufenxiyuyouhuaDao;
import com.entity.ShujufenxiyuyouhuaEntity;
import com.service.ShujufenxiyuyouhuaService;
import com.entity.vo.ShujufenxiyuyouhuaVO;
import com.entity.view.ShujufenxiyuyouhuaView;

@Service("shujufenxiyuyouhuaService")
public class ShujufenxiyuyouhuaServiceImpl extends ServiceImpl<ShujufenxiyuyouhuaDao, ShujufenxiyuyouhuaEntity> implements ShujufenxiyuyouhuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShujufenxiyuyouhuaEntity> page = this.selectPage(
                new Query<ShujufenxiyuyouhuaEntity>(params).getPage(),
                new EntityWrapper<ShujufenxiyuyouhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShujufenxiyuyouhuaEntity> wrapper) {
		  Page<ShujufenxiyuyouhuaView> page =new Query<ShujufenxiyuyouhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShujufenxiyuyouhuaVO> selectListVO(Wrapper<ShujufenxiyuyouhuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShujufenxiyuyouhuaVO selectVO(Wrapper<ShujufenxiyuyouhuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShujufenxiyuyouhuaView> selectListView(Wrapper<ShujufenxiyuyouhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShujufenxiyuyouhuaView selectView(Wrapper<ShujufenxiyuyouhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
