package com.entity.model;

import com.entity.TudiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 土地
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public class TudiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 面积(㎡)
	 */
	
	private Double mianji;
		
	/**
	 * 土壤情况
	 */
	
	private String turangqingkuang;
		
	/**
	 * 农场主账号
	 */
	
	private String nongchangzhuzhanghao;
		
	/**
	 * 农场主
	 */
	
	private String nongchangzhu;
		
	/**
	 * 土地图片
	 */
	
	private String tuditupian;
		
	/**
	 * 土地位置
	 */
	
	private String tudiweizhi;
		
	/**
	 * 土壤质量
	 */
	
	private String turangzhiliang;
				
	
	/**
	 * 设置：面积(㎡)
	 */
	 
	public void setMianji(Double mianji) {
		this.mianji = mianji;
	}
	
	/**
	 * 获取：面积(㎡)
	 */
	public Double getMianji() {
		return mianji;
	}
				
	
	/**
	 * 设置：土壤情况
	 */
	 
	public void setTurangqingkuang(String turangqingkuang) {
		this.turangqingkuang = turangqingkuang;
	}
	
	/**
	 * 获取：土壤情况
	 */
	public String getTurangqingkuang() {
		return turangqingkuang;
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
				
	
	/**
	 * 设置：土地图片
	 */
	 
	public void setTuditupian(String tuditupian) {
		this.tuditupian = tuditupian;
	}
	
	/**
	 * 获取：土地图片
	 */
	public String getTuditupian() {
		return tuditupian;
	}
				
	
	/**
	 * 设置：土地位置
	 */
	 
	public void setTudiweizhi(String tudiweizhi) {
		this.tudiweizhi = tudiweizhi;
	}
	
	/**
	 * 获取：土地位置
	 */
	public String getTudiweizhi() {
		return tudiweizhi;
	}
				
	
	/**
	 * 设置：土壤质量
	 */
	 
	public void setTurangzhiliang(String turangzhiliang) {
		this.turangzhiliang = turangzhiliang;
	}
	
	/**
	 * 获取：土壤质量
	 */
	public String getTurangzhiliang() {
		return turangzhiliang;
	}
			
}
