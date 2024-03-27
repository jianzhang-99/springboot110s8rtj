package com.entity.view;

import com.entity.ZhongzhifeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 种植费用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@TableName("zhongzhifeiyong")
public class ZhongzhifeiyongView  extends ZhongzhifeiyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongzhifeiyongView(){
	}
 
 	public ZhongzhifeiyongView(ZhongzhifeiyongEntity zhongzhifeiyongEntity){
 	try {
			BeanUtils.copyProperties(this, zhongzhifeiyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
