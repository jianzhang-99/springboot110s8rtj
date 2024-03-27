package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzhijihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzhijihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzhijihuaView;


/**
 * 种植计划
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface ZhongzhijihuaService extends IService<ZhongzhijihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzhijihuaVO> selectListVO(Wrapper<ZhongzhijihuaEntity> wrapper);
   	
   	ZhongzhijihuaVO selectVO(@Param("ew") Wrapper<ZhongzhijihuaEntity> wrapper);
   	
   	List<ZhongzhijihuaView> selectListView(Wrapper<ZhongzhijihuaEntity> wrapper);
   	
   	ZhongzhijihuaView selectView(@Param("ew") Wrapper<ZhongzhijihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzhijihuaEntity> wrapper);

   	

}

