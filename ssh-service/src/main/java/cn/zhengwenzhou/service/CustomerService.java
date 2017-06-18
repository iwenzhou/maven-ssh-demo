package cn.zhengwenzhou.service;

import cn.zhengwenzhou.entity.Customer;

public interface CustomerService
{
	/**
	 * 通过ID获取用户信息
	 * @param id
	 * @return
	 */
	public Customer findById(Long id);
}
