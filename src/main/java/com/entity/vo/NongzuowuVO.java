package com.entity.vo;

import com.entity.NongzuowuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 农作物
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public class NongzuowuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 种植面积(㎡)
	 */
	
	private Double zhongzhimianji;
		
	/**
	 * 农场主账号
	 */
	
	private String nongchangzhuzhanghao;
		
	/**
	 * 农场主
	 */
	
	private String nongchangzhu;
		
	/**
	 * 作物名称
	 */
	
	private String zuowumingcheng;
		
	/**
	 * 种植时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhongzhishijian;
		
	/**
	 * 预计收获
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yujishouhuo;
		
	/**
	 * 施肥计划
	 */
	
	private String shifeijihua;
		
	/**
	 * 种植户账号
	 */
	
	private String zhongzhihuzhanghao;
		
	/**
	 * 种植户
	 */
	
	private String zhongzhihu;
		
	/**
	 * 种植图片
	 */
	
	private String zhongzhitupian;
				
	
	/**
	 * 设置：种植面积(㎡)
	 */
	 
	public void setZhongzhimianji(Double zhongzhimianji) {
		this.zhongzhimianji = zhongzhimianji;
	}
	
	/**
	 * 获取：种植面积(㎡)
	 */
	public Double getZhongzhimianji() {
		return zhongzhimianji;
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
	 * 设置：作物名称
	 */
	 
	public void setZuowumingcheng(String zuowumingcheng) {
		this.zuowumingcheng = zuowumingcheng;
	}
	
	/**
	 * 获取：作物名称
	 */
	public String getZuowumingcheng() {
		return zuowumingcheng;
	}
				
	
	/**
	 * 设置：种植时间
	 */
	 
	public void setZhongzhishijian(Date zhongzhishijian) {
		this.zhongzhishijian = zhongzhishijian;
	}
	
	/**
	 * 获取：种植时间
	 */
	public Date getZhongzhishijian() {
		return zhongzhishijian;
	}
				
	
	/**
	 * 设置：预计收获
	 */
	 
	public void setYujishouhuo(Date yujishouhuo) {
		this.yujishouhuo = yujishouhuo;
	}
	
	/**
	 * 获取：预计收获
	 */
	public Date getYujishouhuo() {
		return yujishouhuo;
	}
				
	
	/**
	 * 设置：施肥计划
	 */
	 
	public void setShifeijihua(String shifeijihua) {
		this.shifeijihua = shifeijihua;
	}
	
	/**
	 * 获取：施肥计划
	 */
	public String getShifeijihua() {
		return shifeijihua;
	}
				
	
	/**
	 * 设置：种植户账号
	 */
	 
	public void setZhongzhihuzhanghao(String zhongzhihuzhanghao) {
		this.zhongzhihuzhanghao = zhongzhihuzhanghao;
	}
	
	/**
	 * 获取：种植户账号
	 */
	public String getZhongzhihuzhanghao() {
		return zhongzhihuzhanghao;
	}
				
	
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
	 * 设置：种植图片
	 */
	 
	public void setZhongzhitupian(String zhongzhitupian) {
		this.zhongzhitupian = zhongzhitupian;
	}
	
	/**
	 * 获取：种植图片
	 */
	public String getZhongzhitupian() {
		return zhongzhitupian;
	}
			
}
