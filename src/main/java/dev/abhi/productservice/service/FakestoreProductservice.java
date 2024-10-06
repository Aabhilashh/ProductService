package dev.abhi.productservice.service;

import dev.abhi.productservice.models.Category;
import dev.abhi.productservice.models.product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("fakestore")
public class FakestoreProductservice implements ProductService {
    @Override
    public List<product> getAllAvailableProducts() {
        return List.of();
    }

    @Override
    public product getProductDetails(int productid) {
        return null;
    }

    @Override
    public product letsCreateProduct(String title, String description, int price, Category category, String imageURL) {
        return null;
    }
}
