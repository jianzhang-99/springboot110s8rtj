package com.entity.model;

import com.entity.ShebeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 设备信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public class ShebeixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 型号
	 */
	
	private String xinghao;
		
	/**
	 * 设备分类
	 */
	
	private String shebeifenlei;
		
	/**
	 * 具体功能
	 */
	
	private String jutigongneng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 设备位置
	 */
	
	private String shebeiweizhi;
		
	/**
	 * 保养周期
	 */
	
	private String baoyangzhouqi;
		
	/**
	 * 农场主账号
	 */
	
	private String nongchangzhuzhanghao;
		
	/**
	 * 农场主
	 */
	
	private String nongchangzhu;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：型号
	 */
	 
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	
	/**
	 * 获取：型号
	 */
	public String getXinghao() {
		return xinghao;
	}
				
	
	/**
	 * 设置：设备分类
	 */
	 
	public void setShebeifenlei(String shebeifenlei) {
		this.shebeifenlei = shebeifenlei;
	}
	
	/**
	 * 获取：设备分类
	 */
	public String getShebeifenlei() {
		return shebeifenlei;
	}
				
	
	/**
	 * 设置：具体功能
	 */
	 
	public void setJutigongneng(String jutigongneng) {
		this.jutigongneng = jutigongneng;
	}
	
	/**
	 * 获取：具体功能
	 */
	public String getJutigongneng() {
		return jutigongneng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：设备位置
	 */
	 
	public void setShebeiweizhi(String shebeiweizhi) {
		this.shebeiweizhi = shebeiweizhi;
	}
	
	/**
	 * 获取：设备位置
	 */
	public String getShebeiweizhi() {
		return shebeiweizhi;
	}
				
	
	/**
	 * 设置：保养周期
	 */
	 
	public void setBaoyangzhouqi(String baoyangzhouqi) {
		this.baoyangzhouqi = baoyangzhouqi;
	}
	
	/**
	 * 获取：保养周期
	 */
	public String getBaoyangzhouqi() {
		return baoyangzhouqi;
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
				
	
	/**
	 * 设置：农场主
	 */
	 
	public void setNongchangzhu(String nongchangzhu) {
		this.nongchangzhu = nongchangzhu;
	}
	
	/**
	 * 获取：农场主
	 */
	public String getNongchangzhu() {
		return nongchangzhu;
	}
			
}
