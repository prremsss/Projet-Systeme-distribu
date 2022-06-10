package org.customerservice.customerservice.mappers;

import org.customerservice.customerservice.dto.CustomerReqDTO;
import org.customerservice.customerservice.dto.CustomerRespDTO;
import org.customerservice.customerservice.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
CustomerRespDTO customerToCustomerRespDTO(Customer customer);
    Customer CustomerReqDTOTocustomer(CustomerReqDTO customerReqDTO);

}
