package com.coderjourney.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping()
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("Regiistratioon of a new customer {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
}
