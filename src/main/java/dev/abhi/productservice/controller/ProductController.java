package dev.abhi.productservice.controller;

import dev.abhi.productservice.DTOs.RequestBodyProductDTO;
import dev.abhi.productservice.models.Category;
import dev.abhi.productservice.models.product;
import dev.abhi.productservice.service.FakestoreProductservice;
//import dev.abhi.productservice.service.MyOwnProductService;
import dev.abhi.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    ProductService productService;
    public ProductController(@Qualifier("fakestore") ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public product createProduct(@RequestBody RequestBodyProductDTO request) {
        return productService.letsCreateProduct(request.getTitle(),
                                         request.getPrice(),
                                         request.getDescription(),
                                         request.getImage(),
                                         request.getCategory());
    }

    @GetMapping("/products/{id}")
    public product getProductById(@PathVariable("id") Long id) {
       return productService.getProductDetails(id);


    }

    @GetMapping("/products")
    public List<product> getAllProducts(){
        return null;
    }

    @PutMapping("/products/{itemid}")
    public void updateProduct(){

    }

}
