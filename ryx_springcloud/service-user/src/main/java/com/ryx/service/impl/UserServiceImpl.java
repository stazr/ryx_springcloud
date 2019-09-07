package com.ryx.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ryx.entity.enums.PageSize;
import com.ryx.entity.page.PaginationResult;
import com.ryx.entity.page.SimplePage;
import com.ryx.entity.query.UserQuery;
import com.ryx.mapper.UserMapper;
import com.ryx.service.UserService;
import com.ryx.serviceinterface.pojo.User;
import org.springframework.stereotype.Service;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper<User,UserQuery> userMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<User> findListByParam(UserQuery param) {
		List<User> list = this.userMapper.selectList(param);
		return list;
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(UserQuery param) {
		Integer count = this.userMapper.selectCount(param);
		return count;
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResult<User> findListByPage(UserQuery param) {
		int count = this.userMapper.selectCount(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();
		int pageNo = 0;
		if (null != param.getPageNo()) {
			pageNo=param.getPageNo();
		}
		SimplePage page = new SimplePage(pageNo, count, pageSize);
		param.setPage(page);
		List<User> list = this.userMapper.selectList(param);
		PaginationResult<User> result = new PaginationResult<User>(page, list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(User bean){
		return this.userMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<User> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userMapper.insertBatch(listBean);
	}

	/**
	 * 修改
	 */
	@Override
	public Integer updateByPrimaryKey(User bean,Integer id){
		return this.userMapper.updateByPrimaryKey(bean,id);
	}

	/**
	 * 删除
	 */
	@Override
	public Integer deleteByPrimaryKey(Integer id){
		return this.userMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据primaryKey获取对象
	 */
	@Override
	public User getUserByPrimaryKey(Integer id){
		return this.userMapper.selectByPrimaryKey(id);
	}

}