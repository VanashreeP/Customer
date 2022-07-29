package com.customer.Customers.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.customer.Customers.Entity.Customers;

@Component
public interface CustomerService {
	
	Customers saveCustomer(Customers customer);
	List<Customers> getAllCustomers();
	Customers getCustomerById(int id);
	Customers getCustomerByName(String name);
	List<Customers> findAll();
	Customers findById(int id);
	Customers findByName(String name);

}
