package com.codegym.customerthymeleaf.service.customer;

import com.codegym.customerthymeleaf.model.Customer;
import com.codegym.customerthymeleaf.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    ICustomerRepository customerRepository;
    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Optional<Customer> findAllByNameContaining(String name) {
        return customerRepository.findAllByNameContaining(name);
    }

    @Override
    public Iterable<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }
}