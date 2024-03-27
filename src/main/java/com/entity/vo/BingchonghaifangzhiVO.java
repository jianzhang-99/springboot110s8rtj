package com.entity.vo;

import com.entity.BingchonghaifangzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 病虫害防治
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public class BingchonghaifangzhiVO  implements Serializable {
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fangzhishijian;
		
	/**
	 * 防治措施
	 */
	
	private String fangzhicuoshi;
				
	
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
