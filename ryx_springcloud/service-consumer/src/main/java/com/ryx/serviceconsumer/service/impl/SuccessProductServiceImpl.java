package com.ryx.serviceconsumer.service.impl;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.ryx.serviceconsumer.entity.enums.PageSize;
import com.ryx.serviceconsumer.entity.page.PaginationResult;
import com.ryx.serviceconsumer.entity.page.SimplePage;
import com.ryx.serviceconsumer.entity.pojo.SuccessProduct;
import com.ryx.serviceconsumer.entity.query.SuccessProductQuery;
import com.ryx.serviceconsumer.mapper.SuccessProductMapper;
import com.ryx.serviceconsumer.service.SuccessProductService;
import com.ryx.serviceinterface.service.ProductService;
import org.springframework.stereotype.Service;




/**
 * 
 *  业务接口实现
 * 
 */
@Service("successProductService")
public class SuccessProductServiceImpl implements SuccessProductService {


	@Resource
	private ProductService productService;

	@Resource
	private SuccessProductMapper<SuccessProduct,SuccessProductQuery> successProductMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<SuccessProduct> findListByParam(SuccessProductQuery param) {
		List<SuccessProduct> list = this.successProductMapper.selectList(param);
		return list;
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(SuccessProductQuery param) {
		Integer count = this.successProductMapper.selectCount(param);
		return count;
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResult<SuccessProduct> findListByPage(SuccessProductQuery param) {
		int count = this.successProductMapper.selectCount(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();
		int pageNo = 0;
		if (null != param.getPageNo()) {
			pageNo=param.getPageNo();
		}
		SimplePage page = new SimplePage(pageNo, count, pageSize);
		param.setPage(page);
		List<SuccessProduct> list = this.successProductMapper.selectList(param);
		PaginationResult<SuccessProduct> result = new PaginationResult<SuccessProduct>(page, list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(SuccessProduct bean){
		return this.successProductMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<SuccessProduct> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.successProductMapper.insertBatch(listBean);
	}

	/**
	 * 修改
	 */
	@Override
	public Integer updateByPrimaryKey(SuccessProduct bean,Integer id){
		return this.successProductMapper.updateByPrimaryKey(bean,id);
	}

	/**
	 * 删除
	 */
	@Override
	public Integer deleteByPrimaryKey(Integer id){
		return this.successProductMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据primaryKey获取对象
	 */
	@Override
	public SuccessProduct getSuccessProductByPrimaryKey(Integer id){
		return this.successProductMapper.selectByPrimaryKey(id);
	}

	@Override
	@GlobalTransactional
	public void globalTransactionAdd(String name,Integer price) {
		//先往商品列表新增，之后再往另一个数据库新增
		this.productService.insertPro(name,price);
		SuccessProduct successProduct = new SuccessProduct();
		successProduct.setName(name);
		successProduct.setId(new Random().nextInt(100));
		//不同的数据源
		int i = 1/0;
		this.successProductMapper.insert(successProduct);
	}

}