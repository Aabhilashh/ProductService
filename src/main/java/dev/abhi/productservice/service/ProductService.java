package dev.abhi.productservice.service;

import dev.abhi.productservice.models.Category;
import dev.abhi.productservice.models.product;
import java.util.List;

public interface ProductService {
    product getProductDetails(int productid);
    List<product> getAllAvailableProducts();
    product letsCreateProduct(String title,
                  String description,
                  int price,
                  Category category,
                  String imageURL
                    );


}
