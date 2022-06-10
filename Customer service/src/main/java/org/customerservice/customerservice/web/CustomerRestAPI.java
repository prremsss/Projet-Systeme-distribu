package org.customerservice.customerservice.web;

import org.customerservice.customerservice.dto.CustomerReqDTO;
import org.customerservice.customerservice.dto.CustomerRespDTO;
import org.customerservice.customerservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class CustomerRestAPI {

    private CustomerService customerService;

    public CustomerRestAPI(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping(path = "/customers")
    public List<CustomerRespDTO> allCustomers(){
        return customerService.listCustomers();


    }
    @PostMapping(path = "/customers")
    public CustomerRespDTO save (@RequestBody CustomerReqDTO customerReqDTO){
        return customerService.save(customerReqDTO);
    }
    @GetMapping(path = "/customers/{id}")

    public CustomerRespDTO getCustomer ( @PathVariable Long id){
return  customerService.getCustomer(id);
    }


}
