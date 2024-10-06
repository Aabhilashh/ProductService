package dev.abhi.productservice.service;

import dev.abhi.productservice.models.Category;
import dev.abhi.productservice.models.product;

import java.util.List;

public class MyOwnProductService implements ProductService{
    @Override
    public product letsCreateProduct(String title, String description, int price, Category category, String imageURL) {
        return null;
    }

    @Override
    public product getProductDetails(int productid) {
        return null;
    }

    @Override
    public List<product> getAllAvailableProducts() {
        return List.of();
    }
}
