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
 * 质量检测和溯源
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:41
 */
@TableName("zhiliangjiancehesuyuan")
public class ZhiliangjiancehesuyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiliangjiancehesuyuanEntity() {
		
	}
	
	public ZhiliangjiancehesuyuanEntity(T t) {
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
	 * 种植户账号
	 */
					
	private String zhongzhihuzhanghao;
	
	/**
	 * 种植户
	 */
					
	private String zhongzhihu;
	
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
	 * 检测项目
	 */
					
	private String jiancexiangmu;
	
	/**
	 * 检测结果
	 */
					
	private String jiancejieguo;
	
	/**
	 * 溯源码
	 */
					
	private String suyuanma;
	
	/**
	 * 认证机构
	 */
					
	private String renzhengjigou;
	
	/**
	 * 检测报告
	 */
					
	private String jiancebaogao;
	
	
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
	 * 设置：检测项目
	 */
	public void setJiancexiangmu(String jiancexiangmu) {
		this.jiancexiangmu = jiancexiangmu;
	}
	/**
	 * 获取：检测项目
	 */
	public String getJiancexiangmu() {
		return jiancexiangmu;
	}
	/**
	 * 设置：检测结果
	 */
	public void setJiancejieguo(String jiancejieguo) {
		this.jiancejieguo = jiancejieguo;
	}
	/**
	 * 获取：检测结果
	 */
	public String getJiancejieguo() {
		return jiancejieguo;
	}
	/**
	 * 设置：溯源码
	 */
	public void setSuyuanma(String suyuanma) {
		this.suyuanma = suyuanma;
	}
	/**
	 * 获取：溯源码
	 */
	public String getSuyuanma() {
		return suyuanma;
	}
	/**
	 * 设置：认证机构
	 */
	public void setRenzhengjigou(String renzhengjigou) {
		this.renzhengjigou = renzhengjigou;
	}
	/**
	 * 获取：认证机构
	 */
	public String getRenzhengjigou() {
		return renzhengjigou;
	}
	/**
	 * 设置：检测报告
	 */
	public void setJiancebaogao(String jiancebaogao) {
		this.jiancebaogao = jiancebaogao;
	}
	/**
	 * 获取：检测报告
	 */
	public String getJiancebaogao() {
		return jiancebaogao;
	}

}
