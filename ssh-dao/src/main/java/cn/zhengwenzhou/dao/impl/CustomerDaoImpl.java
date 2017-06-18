package cn.zhengwenzhou.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cn.zhengwenzhou.dao.CustomerDao;
import cn.zhengwenzhou.entity.Customer;


public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao
{

	@Override
	public Customer findById(Long id)
	{
		return this.getHibernateTemplate().get(Customer.class, id);
	}

}
