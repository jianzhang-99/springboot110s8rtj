package com.entity.view;

import com.entity.ZhongzhijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 种植计划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@TableName("zhongzhijihua")
public class ZhongzhijihuaView  extends ZhongzhijihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongzhijihuaView(){
	}
 
 	public ZhongzhijihuaView(ZhongzhijihuaEntity zhongzhijihuaEntity){
 	try {
			BeanUtils.copyProperties(this, zhongzhijihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
