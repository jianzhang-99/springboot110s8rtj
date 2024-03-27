package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病虫害措施
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@TableName("bingchonghaicuoshi")
public class BingchonghaicuoshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BingchonghaicuoshiEntity() {
		
	}
	
	public BingchonghaicuoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 病虫害类型
	 */
					
	private String bingchonghaileixing;
	
	/**
	 * 防治措施
	 */
					
	private String fangzhicuoshi;
	
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
	 * 推荐设备
	 */
					
	private String tuijianshebei;
	
	/**
	 * 推荐农药
	 */
					
	private String tuijiannongyao;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * 设置：病虫害类型
	 */
	public void setBingchonghaileixing(String bingchonghaileixing) {
		this.bingchonghaileixing = bingchonghaileixing;
	}
	/**
	 * 获取：病虫害类型
	 */
	public String getBingchonghaileixing() {
		return bingchonghaileixing;
	}
	/**
	 * 设置：防治措施
	 */
	public void setFangzhicuoshi(String fangzhicuoshi) {
		this.fangzhicuoshi = fangzhicuoshi;
	}
	/**
	 * 获取：防治措施
	 */
	public String getFangzhicuoshi() {
		return fangzhicuoshi;
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
	 * 设置：推荐设备
	 */
	public void setTuijianshebei(String tuijianshebei) {
		this.tuijianshebei = tuijianshebei;
	}
	/**
	 * 获取：推荐设备
	 */
	public String getTuijianshebei() {
		return tuijianshebei;
	}
	/**
	 * 设置：推荐农药
	 */
	public void setTuijiannongyao(String tuijiannongyao) {
		this.tuijiannongyao = tuijiannongyao;
	}
	/**
	 * 获取：推荐农药
	 */
	public String getTuijiannongyao() {
		return tuijiannongyao;
	}
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

}
