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


import com.dao.ZhiliangjiancehesuyuanDao;
import com.entity.ZhiliangjiancehesuyuanEntity;
import com.service.ZhiliangjiancehesuyuanService;
import com.entity.vo.ZhiliangjiancehesuyuanVO;
import com.entity.view.ZhiliangjiancehesuyuanView;

@Service("zhiliangjiancehesuyuanService")
public class ZhiliangjiancehesuyuanServiceImpl extends ServiceImpl<ZhiliangjiancehesuyuanDao, ZhiliangjiancehesuyuanEntity> implements ZhiliangjiancehesuyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiliangjiancehesuyuanEntity> page = this.selectPage(
                new Query<ZhiliangjiancehesuyuanEntity>(params).getPage(),
                new EntityWrapper<ZhiliangjiancehesuyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiliangjiancehesuyuanEntity> wrapper) {
		  Page<ZhiliangjiancehesuyuanView> page =new Query<ZhiliangjiancehesuyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhiliangjiancehesuyuanVO> selectListVO(Wrapper<ZhiliangjiancehesuyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiliangjiancehesuyuanVO selectVO(Wrapper<ZhiliangjiancehesuyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiliangjiancehesuyuanView> selectListView(Wrapper<ZhiliangjiancehesuyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiliangjiancehesuyuanView selectView(Wrapper<ZhiliangjiancehesuyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
