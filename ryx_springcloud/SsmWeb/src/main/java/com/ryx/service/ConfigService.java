package com.ryx.service;




import com.ryx.pojo.Config;



/**
 * 
 *  业务接口
 * 
 */
public interface ConfigService {

	/**
	 * 根据primaryKey获取对象
	 */
	 public Config getConfigByPrimaryKey(String key);

}