package cn.zhengwenzhou.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zhengwenzhou.dao.CustomerDao;
import cn.zhengwenzhou.entity.Customer;


@ContextConfiguration(locations={"classpath:applicationContext-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerDaoImplTest
{
	
	private ApplicationContext applicationContext;

	// 自动注入测试方法
	@Autowired
	private CustomerDao customerDao;
	
	// 传统测试
	@Test
	public void test()
	{
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
		CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
		Customer customer = customerDao.findById(23L);
		System.out.println("Dao层测试："+customer.getCustName());
	}
	
	
	@Test
	public void testAutowired()
	{
		Customer customer = customerDao.findById(1L);
		System.out.println("Dao层自动注入测试："+customer.getCustName());
	}

}
