package com.entity.view;

import com.entity.BingchonghaicuoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 病虫害措施
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@TableName("bingchonghaicuoshi")
public class BingchonghaicuoshiView  extends BingchonghaicuoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BingchonghaicuoshiView(){
	}
 
 	public BingchonghaicuoshiView(BingchonghaicuoshiEntity bingchonghaicuoshiEntity){
 	try {
			BeanUtils.copyProperties(this, bingchonghaicuoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
