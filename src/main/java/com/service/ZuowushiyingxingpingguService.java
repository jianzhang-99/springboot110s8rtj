package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuowushiyingxingpingguEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuowushiyingxingpingguVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuowushiyingxingpingguView;


/**
 * 作物适应性评估
 *
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public interface ZuowushiyingxingpingguService extends IService<ZuowushiyingxingpingguEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuowushiyingxingpingguVO> selectListVO(Wrapper<ZuowushiyingxingpingguEntity> wrapper);
   	
   	ZuowushiyingxingpingguVO selectVO(@Param("ew") Wrapper<ZuowushiyingxingpingguEntity> wrapper);
   	
   	List<ZuowushiyingxingpingguView> selectListView(Wrapper<ZuowushiyingxingpingguEntity> wrapper);
   	
   	ZuowushiyingxingpingguView selectView(@Param("ew") Wrapper<ZuowushiyingxingpingguEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuowushiyingxingpingguEntity> wrapper);

   	

}

