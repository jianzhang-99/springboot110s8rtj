package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingchonghaicuoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingchonghaicuoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingchonghaicuoshiView;


/**
 * 病虫害措施
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface BingchonghaicuoshiService extends IService<BingchonghaicuoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingchonghaicuoshiVO> selectListVO(Wrapper<BingchonghaicuoshiEntity> wrapper);
   	
   	BingchonghaicuoshiVO selectVO(@Param("ew") Wrapper<BingchonghaicuoshiEntity> wrapper);
   	
   	List<BingchonghaicuoshiView> selectListView(Wrapper<BingchonghaicuoshiEntity> wrapper);
   	
   	BingchonghaicuoshiView selectView(@Param("ew") Wrapper<BingchonghaicuoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingchonghaicuoshiEntity> wrapper);

   	

}

