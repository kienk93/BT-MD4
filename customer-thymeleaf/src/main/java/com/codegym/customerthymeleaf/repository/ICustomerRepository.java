package com.codegym.customerthymeleaf.repository;

import com.codegym.customerthymeleaf.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findAllByNameContaining(String name);
    Iterable<Customer> findByName(String name);
}