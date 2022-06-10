package org.customerservice.customerservice.services;

import org.customerservice.customerservice.dto.CustomerReqDTO;
import org.customerservice.customerservice.dto.CustomerRespDTO;

import java.util.List;

public interface CustomerService {
   CustomerRespDTO save(CustomerReqDTO customerReqDTO );
   CustomerRespDTO getCustomer(Long id);
    CustomerRespDTO update(CustomerReqDTO customerReqDTO );
    List<CustomerRespDTO> listCustomers();



}
