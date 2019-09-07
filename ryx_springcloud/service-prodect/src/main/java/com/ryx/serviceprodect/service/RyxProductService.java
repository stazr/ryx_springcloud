package com.ryx.serviceprodect.service;

import com.ryx.serviceinterface.pojo.RyxProduct;
import com.ryx.serviceprodect.page.PaginationResult;
import com.ryx.serviceprodect.query.RyxProductQuery;

import java.util.List;




/**
 * 
 *  业务接口
 * 
 */
public interface RyxProductService {

	/**
	 * 根据条件查询列表
	 */
	public List<RyxProduct> findListByParam(RyxProductQuery param);

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(RyxProductQuery param);

	/**
	 * 分页查询
	 */
	public PaginationResult<RyxProduct> findListByPage(RyxProductQuery param);

	/**
	 * 新增
	 */
	public Integer add(RyxProduct bean);

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<RyxProduct> listBean);

	/**
	 * 根据主键修改
	 */
	public Integer updateByPrimaryKey(RyxProduct bean, Integer id);


	/**
	 * 根据主键删除
	 */
	public Integer deleteByPrimaryKey(Integer id);


	/**
	 * 根据primaryKey获取对象
	 */
	 public RyxProduct getRyxProductByPrimaryKey(Integer id);

    List<RyxProduct> getList();
}