package com.entity.view;

import com.entity.NongchangfeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 农场费用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@TableName("nongchangfeiyong")
public class NongchangfeiyongView  extends NongchangfeiyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongchangfeiyongView(){
	}
 
 	public NongchangfeiyongView(NongchangfeiyongEntity nongchangfeiyongEntity){
 	try {
			BeanUtils.copyProperties(this, nongchangfeiyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
