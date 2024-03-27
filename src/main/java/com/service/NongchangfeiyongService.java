package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchangfeiyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchangfeiyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchangfeiyongView;


/**
 * 农场费用
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface NongchangfeiyongService extends IService<NongchangfeiyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchangfeiyongVO> selectListVO(Wrapper<NongchangfeiyongEntity> wrapper);
   	
   	NongchangfeiyongVO selectVO(@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);
   	
   	List<NongchangfeiyongView> selectListView(Wrapper<NongchangfeiyongEntity> wrapper);
   	
   	NongchangfeiyongView selectView(@Param("ew") Wrapper<NongchangfeiyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchangfeiyongEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<NongchangfeiyongEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<NongchangfeiyongEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<NongchangfeiyongEntity> wrapper);



}

