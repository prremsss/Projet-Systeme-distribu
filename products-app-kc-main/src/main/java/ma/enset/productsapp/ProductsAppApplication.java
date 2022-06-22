package ma.enset.productsapp;

import ma.enset.productsapp.entities.Product;
import ma.enset.productsapp.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsAppApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null, "Iphone 13 pro max", 20000, 8));
            productRepository.save(new Product(null, "Macbook pro", 30000, 19));
            productRepository.save(new Product(null, "Apple watch 3", 5000, 21));
        };
    }

}
