package com.entity.view;

import com.entity.NongyejishuyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 农业技术员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@TableName("nongyejishuyuan")
public class NongyejishuyuanView  extends NongyejishuyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongyejishuyuanView(){
	}
 
 	public NongyejishuyuanView(NongyejishuyuanEntity nongyejishuyuanEntity){
 	try {
			BeanUtils.copyProperties(this, nongyejishuyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
