package com.entity.model;

import com.entity.ZhongzhijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 种植计划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public class ZhongzhijihuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
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
	 * pH值
	 */
	
	private String phzhi;
		
	/**
	 * 质地
	 */
	
	private String zhidi;
		
	/**
	 * 养分含量
	 */
	
	private String yangfenhanliang;
		
	/**
	 * 水分状况
	 */
	
	private String shuifenzhuangkuang;
		
	/**
	 * 温度(℃)
	 */
	
	private String wendu;
		
	/**
	 * 湿度(%rh)
	 */
	
	private String shidu;
		
	/**
	 * 日照时数
	 */
	
	private String rizhaoshishu;
		
	/**
	 * 降水量
	 */
	
	private String jiangshuiliang;
		
	/**
	 * 种植计划
	 */
	
	private String zhongzhijihua;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
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
	 * 设置：pH值
	 */
	 
	public void setPhzhi(String phzhi) {
		this.phzhi = phzhi;
	}
	
	/**
	 * 获取：pH值
	 */
	public String getPhzhi() {
		return phzhi;
	}
				
	
	/**
	 * 设置：质地
	 */
	 
	public void setZhidi(String zhidi) {
		this.zhidi = zhidi;
	}
	
	/**
	 * 获取：质地
	 */
	public String getZhidi() {
		return zhidi;
	}
				
	
	/**
	 * 设置：养分含量
	 */
	 
	public void setYangfenhanliang(String yangfenhanliang) {
		this.yangfenhanliang = yangfenhanliang;
	}
	
	/**
	 * 获取：养分含量
	 */
	public String getYangfenhanliang() {
		return yangfenhanliang;
	}
				
	
	/**
	 * 设置：水分状况
	 */
	 
	public void setShuifenzhuangkuang(String shuifenzhuangkuang) {
		this.shuifenzhuangkuang = shuifenzhuangkuang;
	}
	
	/**
	 * 获取：水分状况
	 */
	public String getShuifenzhuangkuang() {
		return shuifenzhuangkuang;
	}
				
	
	/**
	 * 设置：温度(℃)
	 */
	 
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}
	
	/**
	 * 获取：温度(℃)
	 */
	public String getWendu() {
		return wendu;
	}
				
	
	/**
	 * 设置：湿度(%rh)
	 */
	 
	public void setShidu(String shidu) {
		this.shidu = shidu;
	}
	
	/**
	 * 获取：湿度(%rh)
	 */
	public String getShidu() {
		return shidu;
	}
				
	
	/**
	 * 设置：日照时数
	 */
	 
	public void setRizhaoshishu(String rizhaoshishu) {
		this.rizhaoshishu = rizhaoshishu;
	}
	
	/**
	 * 获取：日照时数
	 */
	public String getRizhaoshishu() {
		return rizhaoshishu;
	}
				
	
	/**
	 * 设置：降水量
	 */
	 
	public void setJiangshuiliang(String jiangshuiliang) {
		this.jiangshuiliang = jiangshuiliang;
	}
	
	/**
	 * 获取：降水量
	 */
	public String getJiangshuiliang() {
		return jiangshuiliang;
	}
				
	
	/**
	 * 设置：种植计划
	 */
	 
	public void setZhongzhijihua(String zhongzhijihua) {
		this.zhongzhijihua = zhongzhijihua;
	}
	
	/**
	 * 获取：种植计划
	 */
	public String getZhongzhijihua() {
		return zhongzhijihua;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
