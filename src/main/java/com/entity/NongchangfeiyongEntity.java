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
 * 农场费用
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@TableName("nongchangfeiyong")
public class NongchangfeiyongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongchangfeiyongEntity() {
		
	}
	
	public NongchangfeiyongEntity(T t) {
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
	 * 农场主账号
	 */
					
	private String nongchangzhuzhanghao;
	
	/**
	 * 农场主
	 */
					
	private String nongchangzhu;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
