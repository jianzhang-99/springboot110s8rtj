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
 * 设备维护情况
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@TableName("shebeiweihuqingkuang")
public class ShebeiweihuqingkuangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShebeiweihuqingkuangEntity() {
		
	}
	
	public ShebeiweihuqingkuangEntity(T t) {
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
	 * 设备编号
	 */
					
	private String shebeibianhao;
	
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
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 设备位置
	 */
					
	private String shebeiweizhi;
	
	/**
	 * 农场主账号
	 */
					
	private String nongchangzhuzhanghao;
	
	/**
	 * 农场主
	 */
					
	private String nongchangzhu;
	
	/**
	 * 维护时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date weihushijian;
	
	/**
	 * 维护内容
	 */
					
	private String weihuneirong;
	
	
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
	 * 设置：设备编号
	 */
	public void setShebeibianhao(String shebeibianhao) {
		this.shebeibianhao = shebeibianhao;
	}
	/**
	 * 获取：设备编号
	 */
	public String getShebeibianhao() {
		return shebeibianhao;
	}
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
	 * 设置：维护时间
	 */
	public void setWeihushijian(Date weihushijian) {
		this.weihushijian = weihushijian;
	}
	/**
	 * 获取：维护时间
	 */
	public Date getWeihushijian() {
		return weihushijian;
	}
	/**
	 * 设置：维护内容
	 */
	public void setWeihuneirong(String weihuneirong) {
		this.weihuneirong = weihuneirong;
	}
	/**
	 * 获取：维护内容
	 */
	public String getWeihuneirong() {
		return weihuneirong;
	}

}
