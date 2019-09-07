package com.ryx.serviceconsumer.service;

import com.ryx.serviceconsumer.entity.page.PaginationResult;
import com.ryx.serviceconsumer.entity.pojo.SuccessProduct;
import com.ryx.serviceconsumer.entity.query.SuccessProductQuery;
import com.ryx.serviceinterface.pojo.RyxProduct;

import java.util.List;




/**
 * 
 *  业务接口
 * 
 */
public interface SuccessProductService {

	/**
	 * 根据条件查询列表
	 */
	public List<SuccessProduct> findListByParam(SuccessProductQuery param);

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(SuccessProductQuery param);

	/**
	 * 分页查询
	 */
	public PaginationResult<SuccessProduct> findListByPage(SuccessProductQuery param);

	/**
	 * 新增
	 */
	public Integer add(SuccessProduct bean);

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<SuccessProduct> listBean);

	/**
	 * 根据主键修改
	 */
	public Integer updateByPrimaryKey(SuccessProduct bean, Integer id);


	/**
	 * 根据主键删除
	 */
	public Integer deleteByPrimaryKey(Integer id);


	/**
	 * 根据primaryKey获取对象
	 */
	 public SuccessProduct getSuccessProductByPrimaryKey(Integer id);

	void globalTransactionAdd(String name,Integer price);
}