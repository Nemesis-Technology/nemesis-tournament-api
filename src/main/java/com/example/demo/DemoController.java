package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private UserRepository customerRepository;

    @PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String last) {
        User customer = new User();
        customer.setFirstName(first);
        customer.setLastName(last);
        customerRepository.save(customer);
        return "Added new user!";
    }

    @GetMapping("/list")
    public Iterable<User> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public User findCustomerById(@PathVariable Integer id) {
        return customerRepository.findCustomerById(id);
    }
}
