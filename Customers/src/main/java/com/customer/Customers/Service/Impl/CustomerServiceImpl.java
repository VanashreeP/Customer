package com.customer.Customers.Service.Impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.Customers.Entity.Customers;
import com.customer.Customers.Repository.CustomerRepository;
import com.customer.Customers.Service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private CustomerService customerService;

	public CustomerServiceImpl(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@Override
	public Customers saveCustomer(Customers customer) {
		return customerService.saveCustomer(customer);
	}

	@Override
	public List<Customers> getAllCustomers() {
		return  customerService.findAll();
	}

	@Override
	public Customers getCustomerById(int id) {
		return customerService.findById(id);
	}

	@Override
	public Customers getCustomerByName(String name) {
		return customerService.findByName(name);
	}
}
