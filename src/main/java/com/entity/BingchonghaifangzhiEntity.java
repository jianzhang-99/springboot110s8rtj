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
 * 病虫害防治
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
@TableName("bingchonghaifangzhi")
public class BingchonghaifangzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BingchonghaifangzhiEntity() {
		
	}
	
	public BingchonghaifangzhiEntity(T t) {
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
	 * 病虫图片
	 */
					
	private String bingchongtupian;
	
	/**
	 * 病虫害种类
	 */
					
	private String bingchonghaizhonglei;
	
	/**
	 * 防治时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fangzhishijian;
	
	/**
	 * 防治措施
	 */
					
	private String fangzhicuoshi;
	
	
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
	 * 设置：病虫图片
	 */
	public void setBingchongtupian(String bingchongtupian) {
		this.bingchongtupian = bingchongtupian;
	}
	/**
	 * 获取：病虫图片
	 */
	public String getBingchongtupian() {
		return bingchongtupian;
	}
	/**
	 * 设置：病虫害种类
	 */
	public void setBingchonghaizhonglei(String bingchonghaizhonglei) {
		this.bingchonghaizhonglei = bingchonghaizhonglei;
	}
	/**
	 * 获取：病虫害种类
	 */
	public String getBingchonghaizhonglei() {
		return bingchonghaizhonglei;
	}
	/**
	 * 设置：防治时间
	 */
	public void setFangzhishijian(Date fangzhishijian) {
		this.fangzhishijian = fangzhishijian;
	}
	/**
	 * 获取：防治时间
	 */
	public Date getFangzhishijian() {
		return fangzhishijian;
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

}
