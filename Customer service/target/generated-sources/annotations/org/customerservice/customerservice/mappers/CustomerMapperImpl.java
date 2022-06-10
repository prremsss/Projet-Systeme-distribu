package org.customerservice.customerservice.mappers;

import javax.annotation.Generated;
import org.customerservice.customerservice.dto.CustomerReqDTO;
import org.customerservice.customerservice.dto.CustomerRespDTO;
import org.customerservice.customerservice.entities.Customer;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-09T17:04:14+0100",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerRespDTO customerToCustomerRespDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerRespDTO customerRespDTO = new CustomerRespDTO();

        customerRespDTO.setId( customer.getId() );
        customerRespDTO.setName( customer.getName() );
        customerRespDTO.setEmail( customer.getEmail() );

        return customerRespDTO;
    }

    @Override
    public Customer CustomerReqDTOTocustomer(CustomerReqDTO customerReqDTO) {
        if ( customerReqDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerReqDTO.getId() );
        customer.setName( customerReqDTO.getName() );
        customer.setEmail( customerReqDTO.getEmail() );

        return customer;
    }
}
