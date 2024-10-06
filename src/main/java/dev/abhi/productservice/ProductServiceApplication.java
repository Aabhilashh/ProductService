package dev.abhi.productservice;

import dev.abhi.productservice.models.product;
import dev.abhi.productservice.service.FakestoreProductservice;
import dev.abhi.productservice.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
       // ProductService productService = new FakestoreProductservice();

        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
