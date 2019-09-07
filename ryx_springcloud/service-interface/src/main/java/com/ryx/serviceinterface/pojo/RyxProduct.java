package com.ryx.serviceinterface.pojo;

import java.io.Serializable;


/**
 * 
 * 
 * 
 */
@SuppressWarnings("serial")
public class RyxProduct implements Serializable {


	/**
	 * 产品主键id
	 */
	private Integer id;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 价格（分）
	 */
	private Integer price;

	/**
	 * 
	 */
	private java.util.Date createTime;

	/**
	 * 
	 */
	private java.util.Date updateTime;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setPrice(Integer price){
		this.price = price;
	}

	public Integer getPrice(){
		return this.price;
	}

	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}

	public java.util.Date getCreateTime(){
		return this.createTime;
	}

	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

	public String toString (){
		return "产品主键id:"+(id == null ? "空" : id)+"，名称:"+(name == null ? "空" : name)+"，价格（分）:"+(price == null ? "空" : price)+"，createTime:"+(createTime == null ? "空" : createTime)+"，updateTime:"+(updateTime == null ? "空" : updateTime);
	}
}
