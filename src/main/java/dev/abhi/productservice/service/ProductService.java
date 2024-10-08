package dev.abhi.productservice.service;

import dev.abhi.productservice.models.Category;
import dev.abhi.productservice.models.product;
import java.util.List;

public interface ProductService {
    product getProductDetails(Long productid);
    List<product> getAllAvailableProducts();
    product letsCreateProduct(String title,
                              double price,
                              String description,
                              String image,
                              String category
                    );


}
