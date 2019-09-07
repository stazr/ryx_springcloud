package com.ryx.serviceprodect.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ryx.serviceinterface.pojo.RyxProduct;
import com.ryx.serviceprodect.enums.PageSize;
import com.ryx.serviceprodect.mapper.RyxProductMapper;
import com.ryx.serviceprodect.page.PaginationResult;
import com.ryx.serviceprodect.page.SimplePage;
import com.ryx.serviceprodect.query.RyxProductQuery;
import com.ryx.serviceprodect.service.RyxProductService;
import org.springframework.stereotype.Service;




/**
 * 
 *  业务接口实现
 * 
 */
@Service("ryxProductService")
public class RyxProductServiceImpl implements RyxProductService {

	@Resource
	private RyxProductMapper<RyxProduct,RyxProductQuery> ryxProductMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<RyxProduct> findListByParam(RyxProductQuery param) {
		List<RyxProduct> list = this.ryxProductMapper.selectList(param);
		return list;
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(RyxProductQuery param) {
		Integer count = this.ryxProductMapper.selectCount(param);
		return count;
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResult<RyxProduct> findListByPage(RyxProductQuery param) {
		int count = this.ryxProductMapper.selectCount(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();
		int pageNo = 0;
		if (null != param.getPageNo()) {
			pageNo=param.getPageNo();
		}
		SimplePage page = new SimplePage(pageNo, count, pageSize);
		param.setPage(page);
		List<RyxProduct> list = this.ryxProductMapper.selectList(param);
		PaginationResult<RyxProduct> result = new PaginationResult<RyxProduct>(page, list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(RyxProduct bean){
		return this.ryxProductMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<RyxProduct> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.ryxProductMapper.insertBatch(listBean);
	}

	/**
	 * 修改
	 */
	@Override
	public Integer updateByPrimaryKey(RyxProduct bean,Integer id){
		return this.ryxProductMapper.updateByPrimaryKey(bean,id);
	}

	/**
	 * 删除
	 */
	@Override
	public Integer deleteByPrimaryKey(Integer id){
		return this.ryxProductMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据primaryKey获取对象
	 */
	@Override
	public RyxProduct getRyxProductByPrimaryKey(Integer id){
		return this.ryxProductMapper.selectByPrimaryKey(id);
	}

    @Override
    public List<RyxProduct> getList() {
        return this.ryxProductMapper.getList();
    }

}