package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YongpinrukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YongpinrukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YongpinrukuView;


/**
 * 用品入库
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface YongpinrukuService extends IService<YongpinrukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YongpinrukuVO> selectListVO(Wrapper<YongpinrukuEntity> wrapper);
   	
   	YongpinrukuVO selectVO(@Param("ew") Wrapper<YongpinrukuEntity> wrapper);
   	
   	List<YongpinrukuView> selectListView(Wrapper<YongpinrukuEntity> wrapper);
   	
   	YongpinrukuView selectView(@Param("ew") Wrapper<YongpinrukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YongpinrukuEntity> wrapper);

   	

}

