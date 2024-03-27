package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingchonghaifangzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingchonghaifangzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingchonghaifangzhiView;


/**
 * 病虫害防治
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface BingchonghaifangzhiService extends IService<BingchonghaifangzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingchonghaifangzhiVO> selectListVO(Wrapper<BingchonghaifangzhiEntity> wrapper);
   	
   	BingchonghaifangzhiVO selectVO(@Param("ew") Wrapper<BingchonghaifangzhiEntity> wrapper);
   	
   	List<BingchonghaifangzhiView> selectListView(Wrapper<BingchonghaifangzhiEntity> wrapper);
   	
   	BingchonghaifangzhiView selectView(@Param("ew") Wrapper<BingchonghaifangzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingchonghaifangzhiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<BingchonghaifangzhiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<BingchonghaifangzhiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<BingchonghaifangzhiEntity> wrapper);



}

