package com.andrei.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.andrei.springdemo.entity.Customer;

@Repository  //subclass of @Component
public class CustomeDAOImpl implements CustomerDAO {
	
	//inject session factory bean from DemoAppConfig.java
	@Autowired
	private SessionFactory factory;

	@Override
	//@Transactional //move to service layer  // no need for: session.beginTransaction(); session.getTransaction().commit()
	public List<Customer> getCustomers() {
		
		Session session = factory.getCurrentSession();
		
		Query<Customer> query= session.createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> customers = query.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		Session session = factory.getCurrentSession();
		
		session.saveOrUpdate(customer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		Session session = factory.getCurrentSession();
		
		Customer customer = session.get(Customer.class, id);
		
		return customer;
		
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = factory.getCurrentSession();
		
		Query query = session.createQuery("delete from Customer where id=:customerId");
		
		query.setParameter("customerId", id);
		
		query.executeUpdate();
		
	}

}
