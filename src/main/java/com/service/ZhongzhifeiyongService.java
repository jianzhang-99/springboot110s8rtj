package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzhifeiyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzhifeiyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzhifeiyongView;


/**
 * 种植费用
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface ZhongzhifeiyongService extends IService<ZhongzhifeiyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzhifeiyongVO> selectListVO(Wrapper<ZhongzhifeiyongEntity> wrapper);
   	
   	ZhongzhifeiyongVO selectVO(@Param("ew") Wrapper<ZhongzhifeiyongEntity> wrapper);
   	
   	List<ZhongzhifeiyongView> selectListView(Wrapper<ZhongzhifeiyongEntity> wrapper);
   	
   	ZhongzhifeiyongView selectView(@Param("ew") Wrapper<ZhongzhifeiyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzhifeiyongEntity> wrapper);

   	

}

