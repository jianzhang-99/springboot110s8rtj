package com.entity.model;

import com.entity.ZhongzhifeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 种植费用
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public class ZhongzhifeiyongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 种植户
	 */
	
	private String zhongzhihu;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 票据
	 */
	
	private String piaoju;
		
	/**
	 * 支出类型
	 */
	
	private String zhichuleixing;
		
	/**
	 * 支出费用
	 */
	
	private Double zhichufeiyong;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 工作量
	 */
	
	private String gongzuoliang;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：种植户
	 */
	 
	public void setZhongzhihu(String zhongzhihu) {
		this.zhongzhihu = zhongzhihu;
	}
	
	/**
	 * 获取：种植户
	 */
	public String getZhongzhihu() {
		return zhongzhihu;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：票据
	 */
	 
	public void setPiaoju(String piaoju) {
		this.piaoju = piaoju;
	}
	
	/**
	 * 获取：票据
	 */
	public String getPiaoju() {
		return piaoju;
	}
				
	
	/**
	 * 设置：支出类型
	 */
	 
	public void setZhichuleixing(String zhichuleixing) {
		this.zhichuleixing = zhichuleixing;
	}
	
	/**
	 * 获取：支出类型
	 */
	public String getZhichuleixing() {
		return zhichuleixing;
	}
				
	
	/**
	 * 设置：支出费用
	 */
	 
	public void setZhichufeiyong(Double zhichufeiyong) {
		this.zhichufeiyong = zhichufeiyong;
	}
	
	/**
	 * 获取：支出费用
	 */
	public Double getZhichufeiyong() {
		return zhichufeiyong;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：工作量
	 */
	 
	public void setGongzuoliang(String gongzuoliang) {
		this.gongzuoliang = gongzuoliang;
	}
	
	/**
	 * 获取：工作量
	 */
	public String getGongzuoliang() {
		return gongzuoliang;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
