package vn.khanh.springmvc.demojpa.service;


import java.util.List;

import vn.khanh.springmvc.demojpa.entity.Customer;

public interface CustomerService {
	List<Customer> findAll();

	Customer findById(int id);

	void save(Customer customer);

	void remove(int id);
}