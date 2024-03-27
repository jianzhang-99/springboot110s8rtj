package com.entity.model;

import com.entity.ShujufenxiyuyouhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 数据分析与优化
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
public class ShujufenxiyuyouhuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 种植面积(㎡)
	 */
	
	private String zhongzhimianji;
		
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
	
	private String zhongzhishijian;
		
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
	 * 技术员账号
	 */
	
	private String jishuyuanzhanghao;
		
	/**
	 * 技术员
	 */
	
	private String jishuyuan;
		
	/**
	 * 技术员手机
	 */
	
	private String jishuyuanshouji;
		
	/**
	 * 分析内容
	 */
	
	private String fenxineirong;
		
	/**
	 * 优化目标
	 */
	
	private String youhuamubiao;
		
	/**
	 * 优化方案
	 */
	
	private String youhuafangan;
		
	/**
	 * 分析时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fenxishijian;
				
	
	/**
	 * 设置：种植面积(㎡)
	 */
	 
	public void setZhongzhimianji(String zhongzhimianji) {
		this.zhongzhimianji = zhongzhimianji;
	}
	
	/**
	 * 获取：种植面积(㎡)
	 */
	public String getZhongzhimianji() {
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
	 
	public void setZhongzhishijian(String zhongzhishijian) {
		this.zhongzhishijian = zhongzhishijian;
	}
	
	/**
	 * 获取：种植时间
	 */
	public String getZhongzhishijian() {
		return zhongzhishijian;
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
				
	
	/**
	 * 设置：技术员账号
	 */
	 
	public void setJishuyuanzhanghao(String jishuyuanzhanghao) {
		this.jishuyuanzhanghao = jishuyuanzhanghao;
	}
	
	/**
	 * 获取：技术员账号
	 */
	public String getJishuyuanzhanghao() {
		return jishuyuanzhanghao;
	}
				
	
	/**
	 * 设置：技术员
	 */
	 
	public void setJishuyuan(String jishuyuan) {
		this.jishuyuan = jishuyuan;
	}
	
	/**
	 * 获取：技术员
	 */
	public String getJishuyuan() {
		return jishuyuan;
	}
				
	
	/**
	 * 设置：技术员手机
	 */
	 
	public void setJishuyuanshouji(String jishuyuanshouji) {
		this.jishuyuanshouji = jishuyuanshouji;
	}
	
	/**
	 * 获取：技术员手机
	 */
	public String getJishuyuanshouji() {
		return jishuyuanshouji;
	}
				
	
	/**
	 * 设置：分析内容
	 */
	 
	public void setFenxineirong(String fenxineirong) {
		this.fenxineirong = fenxineirong;
	}
	
	/**
	 * 获取：分析内容
	 */
	public String getFenxineirong() {
		return fenxineirong;
	}
				
	
	/**
	 * 设置：优化目标
	 */
	 
	public void setYouhuamubiao(String youhuamubiao) {
		this.youhuamubiao = youhuamubiao;
	}
	
	/**
	 * 获取：优化目标
	 */
	public String getYouhuamubiao() {
		return youhuamubiao;
	}
				
	
	/**
	 * 设置：优化方案
	 */
	 
	public void setYouhuafangan(String youhuafangan) {
		this.youhuafangan = youhuafangan;
	}
	
	/**
	 * 获取：优化方案
	 */
	public String getYouhuafangan() {
		return youhuafangan;
	}
				
	
	/**
	 * 设置：分析时间
	 */
	 
	public void setFenxishijian(Date fenxishijian) {
		this.fenxishijian = fenxishijian;
	}
	
	/**
	 * 获取：分析时间
	 */
	public Date getFenxishijian() {
		return fenxishijian;
	}
			
}
