package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiliangjiancehesuyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiliangjiancehesuyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiliangjiancehesuyuanView;


/**
 * 质量检测和溯源
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface ZhiliangjiancehesuyuanService extends IService<ZhiliangjiancehesuyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiliangjiancehesuyuanVO> selectListVO(Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);
   	
   	ZhiliangjiancehesuyuanVO selectVO(@Param("ew") Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);
   	
   	List<ZhiliangjiancehesuyuanView> selectListView(Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);
   	
   	ZhiliangjiancehesuyuanView selectView(@Param("ew") Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiliangjiancehesuyuanEntity> wrapper);

   	

}

