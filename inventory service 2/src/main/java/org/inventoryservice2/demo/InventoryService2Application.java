package org.inventoryservice2.demo;

import org.inventoryservice2.demo.entities.Product;
import org.inventoryservice2.demo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryService2Application {

    public static void main(String[] args) {
        SpringApplication.run(InventoryService2Application.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Product.class);
        return args -> {
            productRepository.save(new Product(null, "Iphone 13 pro max", 20000, 8));
            productRepository.save(new Product(null, "Macbook pro", 30000, 19));
            productRepository.save(new Product(null, "Apple watch 3", 5000, 21));
            productRepository.findAll().forEach(p->{
            });
        };
    }

}

