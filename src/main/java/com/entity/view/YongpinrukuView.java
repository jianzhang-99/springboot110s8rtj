package com.entity.view;

import com.entity.YongpinrukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 用品入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@TableName("yongpinruku")
public class YongpinrukuView  extends YongpinrukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YongpinrukuView(){
	}
 
 	public YongpinrukuView(YongpinrukuEntity yongpinrukuEntity){
 	try {
			BeanUtils.copyProperties(this, yongpinrukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
