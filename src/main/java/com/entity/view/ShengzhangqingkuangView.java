package com.entity.view;

import com.entity.ShengzhangqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 生长情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@TableName("shengzhangqingkuang")
public class ShengzhangqingkuangView  extends ShengzhangqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengzhangqingkuangView(){
	}
 
 	public ShengzhangqingkuangView(ShengzhangqingkuangEntity shengzhangqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, shengzhangqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
