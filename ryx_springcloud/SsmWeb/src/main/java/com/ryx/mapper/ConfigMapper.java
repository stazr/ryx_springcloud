package com.ryx.mapper;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 
 *  数据库操作接口
 * 
 */
@MapperScan
public interface ConfigMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据primaryKey更新
	 */
	 public Integer updateByPrimaryKey(@Param("bean") T t, @Param("key") String key);


	/**
	 * 根据primaryKey删除
	 */
	 public Integer deleteByPrimaryKey(@Param("key") String key);


	/**
	 * 根据primaryKey获取对象
	 */
	 public T selectByPrimaryKey(@Param("key") String key);


}
