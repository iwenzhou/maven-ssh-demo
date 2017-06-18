package cn.zhengwenzhou.service.impl;

import cn.zhengwenzhou.dao.CustomerDao;
import cn.zhengwenzhou.entity.Customer;
import cn.zhengwenzhou.service.CustomerService;


public class CustomerServiceImpl implements CustomerService
{
	
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao)
	{
		this.customerDao = customerDao;
	}


	@Override
	public Customer findById(Long id)
	{
		return customerDao.findById(id);
	}

}
