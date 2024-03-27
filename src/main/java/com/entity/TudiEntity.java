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
 * 土地
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@TableName("tudi")
public class TudiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TudiEntity() {
		
	}
	
	public TudiEntity(T t) {
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
	 * 地块编号
	 */
					
	private String dikuaibianhao;
	
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
	 * 设置：地块编号
	 */
	public void setDikuaibianhao(String dikuaibianhao) {
		this.dikuaibianhao = dikuaibianhao;
	}
	/**
	 * 获取：地块编号
	 */
	public String getDikuaibianhao() {
		return dikuaibianhao;
	}
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
