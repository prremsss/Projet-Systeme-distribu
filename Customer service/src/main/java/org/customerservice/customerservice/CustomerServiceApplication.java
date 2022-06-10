package org.customerservice.customerservice;

import org.customerservice.customerservice.dto.CustomerReqDTO;
import org.customerservice.customerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerService customerService){
        return args -> {

            customerService.save(new CustomerReqDTO(1L,"Oualid","Oualid@miloudi.com"));
            customerService.save(new CustomerReqDTO(2L,"Jamal","Jamal@Haddouche.com"));
            customerService.save(new CustomerReqDTO(3L,"Ucef","Ucef@Qarsis.com"));
        };
    }

}
