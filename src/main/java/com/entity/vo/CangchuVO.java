package com.entity.vo;

import com.entity.CangchuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 仓储
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public class CangchuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用品名称
	 */
	
	private String yongpinmingcheng;
		
	/**
	 * 用品类型
	 */
	
	private String yongpinleixing;
		
	/**
	 * 库存
	 */
	
	private Integer kucun;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 用品图片
	 */
	
	private String yongpintupian;
		
	/**
	 * 农场主账号
	 */
	
	private String nongchangzhuzhanghao;
				
	
	/**
	 * 设置：用品名称
	 */
	 
	public void setYongpinmingcheng(String yongpinmingcheng) {
		this.yongpinmingcheng = yongpinmingcheng;
	}
	
	/**
	 * 获取：用品名称
	 */
	public String getYongpinmingcheng() {
		return yongpinmingcheng;
	}
				
	
	/**
	 * 设置：用品类型
	 */
	 
	public void setYongpinleixing(String yongpinleixing) {
		this.yongpinleixing = yongpinleixing;
	}
	
	/**
	 * 获取：用品类型
	 */
	public String getYongpinleixing() {
		return yongpinleixing;
	}
				
	
	/**
	 * 设置：库存
	 */
	 
	public void setKucun(Integer kucun) {
		this.kucun = kucun;
	}
	
	/**
	 * 获取：库存
	 */
	public Integer getKucun() {
		return kucun;
	}
				
	
	/**
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：用品图片
	 */
	 
	public void setYongpintupian(String yongpintupian) {
		this.yongpintupian = yongpintupian;
	}
	
	/**
	 * 获取：用品图片
	 */
	public String getYongpintupian() {
		return yongpintupian;
	}
				
	
	/**
	 * 设置：农场主账号
	 */
	 
	public void setNongchangzhuzhanghao(String nongchangzhuzhanghao) {
		this.nongchangzhuzhanghao = nongchangzhuzhanghao;
	}
	
	/**
	 * 获取：农场主账号
	 */
	public String getNongchangzhuzhanghao() {
		return nongchangzhuzhanghao;
	}
			
}
