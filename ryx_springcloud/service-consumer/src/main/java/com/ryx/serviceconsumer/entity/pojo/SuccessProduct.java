package com.ryx.serviceconsumer.entity.pojo;

import java.io.Serializable;


/**
 * 
 * 
 * 
 */
@SuppressWarnings("serial")
public class SuccessProduct implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String name;


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

	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，name:"+(name == null ? "空" : name);
	}
}
