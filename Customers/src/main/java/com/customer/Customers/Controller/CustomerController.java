package com.customer.Customers.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.Customers.Entity.Customers;
import com.customer.Customers.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Customers>> gtAllCustomers(){
		List<Customers> customer=customerService.getAllCustomers();
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Customers> getCustomerById(@PathVariable("id") Integer id){
		Customers customer=customerService.getCustomerById(id);
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}
	
}