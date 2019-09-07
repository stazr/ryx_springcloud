package com.ryx.query;



/**
 * 
 * 参数
 * 
 */
public class ConfigQuery{


	/**
	 * 
	 */
	private String key;

	private String keyFuzzy;

	/**
	 * 
	 */
	private String value;

	private String valueFuzzy;

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


	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return this.key;
	}

	public void setKeyFuzzy(String keyFuzzy){
		this.keyFuzzy = keyFuzzy;
	}

	public String getKeyFuzzy(){
		return this.keyFuzzy;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return this.value;
	}

	public void setValueFuzzy(String valueFuzzy){
		this.valueFuzzy = valueFuzzy;
	}

	public String getValueFuzzy(){
		return this.valueFuzzy;
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
