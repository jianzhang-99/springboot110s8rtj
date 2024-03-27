package com.entity.model;

import com.entity.YongpinrukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用品入库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public class YongpinrukuModel  implements Serializable {
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
	 * 采购数量
	 */
	
	private Integer kucun;
		
	/**
	 * 采购单价
	 */
	
	private Double caigoudanjia;
		
	/**
	 * 合计
	 */
	
	private Double heji;
		
	/**
	 * 采购时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caigoushijian;
		
	/**
	 * 采购备注
	 */
	
	private String caigoubeizhu;
				
	
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
				
	
	/**
	 * 设置：采购数量
	 */
	 
	public void setKucun(Integer kucun) {
		this.kucun = kucun;
	}
	
	/**
	 * 获取：采购数量
	 */
	public Integer getKucun() {
		return kucun;
	}
				
	
	/**
	 * 设置：采购单价
	 */
	 
	public void setCaigoudanjia(Double caigoudanjia) {
		this.caigoudanjia = caigoudanjia;
	}
	
	/**
	 * 获取：采购单价
	 */
	public Double getCaigoudanjia() {
		return caigoudanjia;
	}
				
	
	/**
	 * 设置：合计
	 */
	 
	public void setHeji(Double heji) {
		this.heji = heji;
	}
	
	/**
	 * 获取：合计
	 */
	public Double getHeji() {
		return heji;
	}
				
	
	/**
	 * 设置：采购时间
	 */
	 
	public void setCaigoushijian(Date caigoushijian) {
		this.caigoushijian = caigoushijian;
	}
	
	/**
	 * 获取：采购时间
	 */
	public Date getCaigoushijian() {
		return caigoushijian;
	}
				
	
	/**
	 * 设置：采购备注
	 */
	 
	public void setCaigoubeizhu(String caigoubeizhu) {
		this.caigoubeizhu = caigoubeizhu;
	}
	
	/**
	 * 获取：采购备注
	 */
	public String getCaigoubeizhu() {
		return caigoubeizhu;
	}
			
}
