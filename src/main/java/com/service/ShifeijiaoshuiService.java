package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShifeijiaoshuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShifeijiaoshuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShifeijiaoshuiView;


/**
 * 施肥浇水
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface ShifeijiaoshuiService extends IService<ShifeijiaoshuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShifeijiaoshuiVO> selectListVO(Wrapper<ShifeijiaoshuiEntity> wrapper);
   	
   	ShifeijiaoshuiVO selectVO(@Param("ew") Wrapper<ShifeijiaoshuiEntity> wrapper);
   	
   	List<ShifeijiaoshuiView> selectListView(Wrapper<ShifeijiaoshuiEntity> wrapper);
   	
   	ShifeijiaoshuiView selectView(@Param("ew") Wrapper<ShifeijiaoshuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShifeijiaoshuiEntity> wrapper);

   	

}

