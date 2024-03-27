package com.entity.model;

import com.entity.NongchangfeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 农场费用
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public class NongchangfeiyongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 农场主
	 */
	
	private String nongchangzhu;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 标题
	 */
	
	private String biaoti;
		
	/**
	 * 票据
	 */
	
	private String piaoju;
		
	/**
	 * 肥料支出
	 */
	
	private Double feiliaozhichu;
		
	/**
	 * 人工成本
	 */
	
	private Double rengongchengben;
		
	/**
	 * 农药支出
	 */
	
	private Double nongyaozhichu;
		
	/**
	 * 种子支出
	 */
	
	private Double zhongzizhichu;
		
	/**
	 * 合计支出
	 */
	
	private Double hejizhichu;
				
	
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
	 * 设置：标题
	 */
	 
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
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
	 * 设置：肥料支出
	 */
	 
	public void setFeiliaozhichu(Double feiliaozhichu) {
		this.feiliaozhichu = feiliaozhichu;
	}
	
	/**
	 * 获取：肥料支出
	 */
	public Double getFeiliaozhichu() {
		return feiliaozhichu;
	}
				
	
	/**
	 * 设置：人工成本
	 */
	 
	public void setRengongchengben(Double rengongchengben) {
		this.rengongchengben = rengongchengben;
	}
	
	/**
	 * 获取：人工成本
	 */
	public Double getRengongchengben() {
		return rengongchengben;
	}
				
	
	/**
	 * 设置：农药支出
	 */
	 
	public void setNongyaozhichu(Double nongyaozhichu) {
		this.nongyaozhichu = nongyaozhichu;
	}
	
	/**
	 * 获取：农药支出
	 */
	public Double getNongyaozhichu() {
		return nongyaozhichu;
	}
				
	
	/**
	 * 设置：种子支出
	 */
	 
	public void setZhongzizhichu(Double zhongzizhichu) {
		this.zhongzizhichu = zhongzizhichu;
	}
	
	/**
	 * 获取：种子支出
	 */
	public Double getZhongzizhichu() {
		return zhongzizhichu;
	}
				
	
	/**
	 * 设置：合计支出
	 */
	 
	public void setHejizhichu(Double hejizhichu) {
		this.hejizhichu = hejizhichu;
	}
	
	/**
	 * 获取：合计支出
	 */
	public Double getHejizhichu() {
		return hejizhichu;
	}
			
}
