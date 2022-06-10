package org.customerservice.customerservice.services;

import org.customerservice.customerservice.dto.CustomerReqDTO;
import org.customerservice.customerservice.dto.CustomerRespDTO;
import org.customerservice.customerservice.entities.Customer;
import org.customerservice.customerservice.mappers.CustomerMapper;
import org.customerservice.customerservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerRespDTO save(CustomerReqDTO customerReqDTO) {
        Customer customer=customerMapper.CustomerReqDTOTocustomer(customerReqDTO);
        Customer saveCustomer=customerRepository.save(customer);
        CustomerRespDTO customerRespDTO = customerMapper.customerToCustomerRespDTO(saveCustomer);
        return customerRespDTO;
    }

    @Override
    public CustomerRespDTO getCustomer(Long id) {
        Customer customer=customerRepository.findById(id).get();



        return customerMapper.customerToCustomerRespDTO(customer);
    }

    @Override
    public CustomerRespDTO update(CustomerReqDTO customerReqDTO) {
        Customer customer = customerMapper.CustomerReqDTOTocustomer(customerReqDTO);
        Customer updatedCustomer = customerRepository.save(customer);



        return customerMapper.customerToCustomerRespDTO(updatedCustomer) ;
    }

    @Override
    public List<CustomerRespDTO> listCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerRespDTO> customerRespDTOS = customers.stream()
                .map(cust-> customerMapper.customerToCustomerRespDTO(cust))
                .collect(Collectors.toList());

        return customerRespDTOS;
    }




}
