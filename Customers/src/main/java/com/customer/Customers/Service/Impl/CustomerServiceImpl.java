package com.customer.Customers.Service.Impl;

import java.util.List;

import com.customer.Customers.Entity.Customers;
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

	@Override
	public List<Customers> findAll() {
		return null;
	}

	@Override
	public Customers findById(int id) {
		return null;
	}

	@Override
	public Customers findByName(String name) {
		return null;
	}
}
