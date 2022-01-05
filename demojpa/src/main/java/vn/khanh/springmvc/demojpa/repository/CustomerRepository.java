package vn.khanh.springmvc.demojpa.repository;

import java.util.List;

import vn.khanh.springmvc.demojpa.entity.Customer;

public interface CustomerRepository {
	List<Customer> findAll();

	Customer findById(int id);

	void save(Customer customer);

	void remove(int id);
}