package com.entity.view;

import com.entity.ShujufenxiyuyouhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 数据分析与优化
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@TableName("shujufenxiyuyouhua")
public class ShujufenxiyuyouhuaView  extends ShujufenxiyuyouhuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShujufenxiyuyouhuaView(){
	}
 
 	public ShujufenxiyuyouhuaView(ShujufenxiyuyouhuaEntity shujufenxiyuyouhuaEntity){
 	try {
			BeanUtils.copyProperties(this, shujufenxiyuyouhuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
