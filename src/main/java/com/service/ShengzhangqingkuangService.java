package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengzhangqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengzhangqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengzhangqingkuangView;


/**
 * 生长情况
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public interface ShengzhangqingkuangService extends IService<ShengzhangqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengzhangqingkuangVO> selectListVO(Wrapper<ShengzhangqingkuangEntity> wrapper);
   	
   	ShengzhangqingkuangVO selectVO(@Param("ew") Wrapper<ShengzhangqingkuangEntity> wrapper);
   	
   	List<ShengzhangqingkuangView> selectListView(Wrapper<ShengzhangqingkuangEntity> wrapper);
   	
   	ShengzhangqingkuangView selectView(@Param("ew") Wrapper<ShengzhangqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengzhangqingkuangEntity> wrapper);

   	

}

