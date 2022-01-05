package vn.khanh.springmvc.demojpa.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import vn.khanh.springmvc.demojpa.entity.Customer;

@Transactional
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Customer> findAll() {
		return em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
	}

	@Override
	public Customer findById(int id) {
		return em.find(Customer.class, id);
	}

	@Override
	public void save(Customer customer) {
		if (customer.getId() != 0)
			em.merge(customer);
		else
			em.persist(customer);
	}

	@Override
	public void remove(int id) {
		Customer customer = findById(id);
		if (customer != null) {
			em.remove(customer);
		}
	}
}