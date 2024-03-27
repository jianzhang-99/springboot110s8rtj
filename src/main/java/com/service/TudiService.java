package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TudiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TudiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TudiView;


/**
 * 土地
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface TudiService extends IService<TudiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TudiVO> selectListVO(Wrapper<TudiEntity> wrapper);
   	
   	TudiVO selectVO(@Param("ew") Wrapper<TudiEntity> wrapper);
   	
   	List<TudiView> selectListView(Wrapper<TudiEntity> wrapper);
   	
   	TudiView selectView(@Param("ew") Wrapper<TudiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TudiEntity> wrapper);

   	

}

