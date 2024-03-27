package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeiweihuqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeiweihuqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeiweihuqingkuangView;


/**
 * 设备维护情况
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface ShebeiweihuqingkuangService extends IService<ShebeiweihuqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeiweihuqingkuangVO> selectListVO(Wrapper<ShebeiweihuqingkuangEntity> wrapper);
   	
   	ShebeiweihuqingkuangVO selectVO(@Param("ew") Wrapper<ShebeiweihuqingkuangEntity> wrapper);
   	
   	List<ShebeiweihuqingkuangView> selectListView(Wrapper<ShebeiweihuqingkuangEntity> wrapper);
   	
   	ShebeiweihuqingkuangView selectView(@Param("ew") Wrapper<ShebeiweihuqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeiweihuqingkuangEntity> wrapper);

   	

}

