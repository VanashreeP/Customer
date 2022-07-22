package com.customer.Customers.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.Customers.Entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
