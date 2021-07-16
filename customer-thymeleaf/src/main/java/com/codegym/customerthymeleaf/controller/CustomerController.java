package com.codegym.customerthymeleaf.controller;

import com.codegym.customerthymeleaf.model.Customer;
import com.codegym.customerthymeleaf.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public ModelAndView showList(String search) {

        Iterable<Customer> customers;
        if(search == null || search.equals("")) {
            customers = customerService.findAll();
        } else{
            customers = customerService.findByName(search);
        }
        ModelAndView modelAndView = new ModelAndView("views/list");

        modelAndView.addObject("customers_list", customers);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("views/create");
        modelAndView.addObject("customers_create", new Customer());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView createCustomer(Customer customer){
        ModelAndView modelAndView = new ModelAndView("redirect:/customers");
        customerService.save(customer);
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("redirect:/customers");
        customerService.delete(id);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditCustomer(@PathVariable Long id,Customer customer){
        ModelAndView modelAndView = new ModelAndView("views/edit");
        modelAndView.addObject("customers_edit",customerService.findById(id));
        modelAndView.addObject("customers",customer);
        return  modelAndView;
    }
    @PostMapping("/edit")
    public ModelAndView EditCustomer(@RequestParam Long id,Customer customer){
        ModelAndView modelAndView = new ModelAndView("redirect:/customers");
        customerService.findById(id);
        customerService.save(customer);
        return modelAndView;
    }

}
