package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongpinchukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongpinchukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongpinchukuView;


/**
 * 用品出库
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface YongpinchukuService extends IService<YongpinchukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongpinchukuVO> selectListVO(Wrapper<YongpinchukuEntity> wrapper);
   	
   	YongpinchukuVO selectVO(@Param("ew") Wrapper<YongpinchukuEntity> wrapper);
   	
   	List<YongpinchukuView> selectListView(Wrapper<YongpinchukuEntity> wrapper);
   	
   	YongpinchukuView selectView(@Param("ew") Wrapper<YongpinchukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongpinchukuEntity> wrapper);

   	

}

