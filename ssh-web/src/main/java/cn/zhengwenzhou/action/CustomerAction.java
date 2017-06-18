
package cn.zhengwenzhou.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.zhengwenzhou.entity.Customer;
import cn.zhengwenzhou.service.CustomerService;

public class CustomerAction extends ActionSupport
{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Customer customer;
	private CustomerService customerService;
	
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public CustomerService getCustomerService()
	{
		return customerService;
	}
	
	public void setCustomerService(CustomerService customerService)
	{
		this.customerService = customerService;
	}

	public String findCustomerById()
	{
		System.out.println("接收到用户ID：" + id);
		customer = customerService.findById(id);
		return SUCCESS;
	}

}
