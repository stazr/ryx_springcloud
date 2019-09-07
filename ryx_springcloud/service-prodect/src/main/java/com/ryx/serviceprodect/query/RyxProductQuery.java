package com.ryx.serviceprodect.query;



/**
 * 
 * 参数
 * 
 */
public class RyxProductQuery extends BaseParam{


	/**
	 * 产品主键id
	 */
	private Integer id;

	/**
	 * 名称
	 */
	private String name;

	private String nameFuzzy;

	/**
	 * 价格（分）
	 */
	private Integer price;

	/**
	 * 
	 */
	private java.util.Date createTime;

	private String createTimeStart;

	private String createTimeEnd;

	/**
	 * 
	 */
	private java.util.Date updateTime;

	private String updateTimeStart;

	private String updateTimeEnd;


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

	public void setNameFuzzy(String nameFuzzy){
		this.nameFuzzy = nameFuzzy;
	}

	public String getNameFuzzy(){
		return this.nameFuzzy;
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

	public void setCreateTimeStart(String createTimeStart){
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeStart(){
		return this.createTimeStart;
	}
	public void setCreateTimeEnd(String createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeEnd(){
		return this.createTimeEnd;
	}

	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}

	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}

	public void setUpdateTimeStart(String updateTimeStart){
		this.updateTimeStart = updateTimeStart;
	}

	public String getUpdateTimeStart(){
		return this.updateTimeStart;
	}
	public void setUpdateTimeEnd(String updateTimeEnd){
		this.updateTimeEnd = updateTimeEnd;
	}

	public String getUpdateTimeEnd(){
		return this.updateTimeEnd;
	}

}
