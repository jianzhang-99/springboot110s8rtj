package com.entity.model;

import com.entity.ShengzhangqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 生长情况
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-29 14:13:40
 */
public class ShengzhangqingkuangModel  implements Serializable {
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
	 * 种植图片
	 */
	
	private String zhongzhitupian;
		
	/**
	 * 生长阶段
	 */
	
	private String shengzhangjieduan;
		
	/**
	 * 叶片状况
	 */
	
	private String yepianzhuangkuang;
		
	/**
	 * 花果状况
	 */
	
	private String huaguozhuangkuang;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
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
	 * 设置：生长阶段
	 */
	 
	public void setShengzhangjieduan(String shengzhangjieduan) {
		this.shengzhangjieduan = shengzhangjieduan;
	}
	
	/**
	 * 获取：生长阶段
	 */
	public String getShengzhangjieduan() {
		return shengzhangjieduan;
	}
				
	
	/**
	 * 设置：叶片状况
	 */
	 
	public void setYepianzhuangkuang(String yepianzhuangkuang) {
		this.yepianzhuangkuang = yepianzhuangkuang;
	}
	
	/**
	 * 获取：叶片状况
	 */
	public String getYepianzhuangkuang() {
		return yepianzhuangkuang;
	}
				
	
	/**
	 * 设置：花果状况
	 */
	 
	public void setHuaguozhuangkuang(String huaguozhuangkuang) {
		this.huaguozhuangkuang = huaguozhuangkuang;
	}
	
	/**
	 * 获取：花果状况
	 */
	public String getHuaguozhuangkuang() {
		return huaguozhuangkuang;
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
			
}
