package dev.abhi.productservice.controller;

import dev.abhi.productservice.models.product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class ProductController {

    @PostMapping("/products")
    public product createProduct(product product) {
        return product;
    }
    @GetMapping("/products/{itemid}")
    public product getProductById(@PathVariable("itemid") id) {
        return null;
    }
    @GetMapping("/products")
    public void getALlProducts(){
        return null;
    }
    @PutMapping("/products/{itemid}")
    public void updateProduct(){
        return null;
    }

}
