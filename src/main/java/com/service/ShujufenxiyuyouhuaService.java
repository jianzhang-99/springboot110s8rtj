package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujufenxiyuyouhuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujufenxiyuyouhuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujufenxiyuyouhuaView;


/**
 * 数据分析与优化
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface ShujufenxiyuyouhuaService extends IService<ShujufenxiyuyouhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujufenxiyuyouhuaVO> selectListVO(Wrapper<ShujufenxiyuyouhuaEntity> wrapper);
   	
   	ShujufenxiyuyouhuaVO selectVO(@Param("ew") Wrapper<ShujufenxiyuyouhuaEntity> wrapper);
   	
   	List<ShujufenxiyuyouhuaView> selectListView(Wrapper<ShujufenxiyuyouhuaEntity> wrapper);
   	
   	ShujufenxiyuyouhuaView selectView(@Param("ew") Wrapper<ShujufenxiyuyouhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujufenxiyuyouhuaEntity> wrapper);

   	

}

