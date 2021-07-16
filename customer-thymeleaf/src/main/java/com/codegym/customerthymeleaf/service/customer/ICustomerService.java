package com.codegym.customerthymeleaf.service.customer;

import com.codegym.customerthymeleaf.model.Customer;
import com.codegym.customerthymeleaf.service.IGeneralService;

import java.util.Optional;

public interface ICustomerService extends IGeneralService<Customer> {
    Optional<Customer> findAllByNameContaining(String name);
    Iterable<Customer> findByName(String name);
}
