package cn.zhengwenzhou.dao;

import cn.zhengwenzhou.entity.Customer;

public interface CustomerDao
{
	/**
	 * 通过ID获取用户信息
	 * @param id 用户ID
	 * @return Customer
	 */
	public Customer findById(Long id);

}
