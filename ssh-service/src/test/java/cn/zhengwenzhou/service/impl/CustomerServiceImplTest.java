package cn.zhengwenzhou.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zhengwenzhou.entity.Customer;
import cn.zhengwenzhou.service.CustomerService;


@ContextConfiguration(locations={"classpath*:applicationContext-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceImplTest
{

	private ApplicationContext applicationContext;
	
	@Autowired
	private CustomerService customerService;

	@Test
	public void test()
	{
		applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext-*.xml");
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		Customer customer = customerService.findById(1L);
		System.out.println("Service层测试："+customer.getCustName());
	}
	
	@Test
	public void testAutowired()
	{
		Customer customer = customerService.findById(23L);
		System.out.println("Service层自动注入测试："+customer.getCustName());
	}

}
