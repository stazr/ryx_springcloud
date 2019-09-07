package com.ryx.serviceprodect.mapper;

import com.ryx.serviceinterface.pojo.RyxProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 
 *  数据库操作接口
 * 
 */
public interface RyxProductMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据primaryKey更新
	 */
	 public Integer updateByPrimaryKey(@Param("bean") T t, @Param("id") Integer id);


	/**
	 * 根据primaryKey删除
	 */
	 public Integer deleteByPrimaryKey(@Param("id") Integer id);


	/**
	 * 根据primaryKey获取对象
	 */
	 public T selectByPrimaryKey(@Param("id") Integer id);


	 @Select("select * from ryx_product")
    List<RyxProduct> getList();
}
