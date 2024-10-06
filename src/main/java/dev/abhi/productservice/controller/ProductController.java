package dev.abhi.productservice.controller;

import dev.abhi.productservice.models.Category;
import dev.abhi.productservice.models.product;
import dev.abhi.productservice.service.FakestoreProductservice;
import dev.abhi.productservice.service.MyOwnProductService;
import dev.abhi.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class ProductController {


    ProductService productService;
    public ProductController(@Qualifier("fakestore") ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/products")
    public product createProduct(product product) {
      return product;
    }
    @GetMapping("/products/{itemid}")
    public product getProductById(@PathVariable("itemid") int id) {
       return productService.getProductDetails(id);


    }
    @GetMapping("/products")
    public List<product> getAllProducts(){
        return null;
    }
    @PutMapping("/products/{itemid}")
    public void updateProduct(){
        return;
    }

}
