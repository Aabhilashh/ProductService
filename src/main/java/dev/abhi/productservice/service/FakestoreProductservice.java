package dev.abhi.productservice.service;

import dev.abhi.productservice.DTOs.FakeStoreProductDTO;
import dev.abhi.productservice.models.Category;
import dev.abhi.productservice.models.product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service("fakestore")
public class FakestoreProductservice implements ProductService {


    private RestTemplate restTemplate;
    public FakestoreProductservice(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public List<product> getAllAvailableProducts() {
        return List.of();
    }

    @Override
    public product getProductDetails(Long productid) {

        ResponseEntity<String> response = restTemplate.getForEntity(
                "https://fakestoreapi.com/products/" + productid, String.class);

        // Log the raw JSON response
        System.out.println("Raw JSON Response: " + response.getBody());

        FakeStoreProductDTO fakestoreproductresponse= restTemplate.getForObject(
                 "https://fakestoreapi.com/products/"+productid,
                FakeStoreProductDTO.class
                );
        System.out.println("DTO Response: " + fakestoreproductresponse);

        // Check if the DTO is populated
        System.out.println("DTO Response: " + fakestoreproductresponse);

        return fakestoreproductresponse.toproduct();

    }

    @Override
    public product letsCreateProduct(String title,
                                     double price,
                                     String description,
                                     String image,
                                     String category) {

        FakeStoreProductDTO fakeStoreProductDTO = new FakeStoreProductDTO();
        fakeStoreProductDTO.setTitle(title);
        fakeStoreProductDTO.setPrice(price);
        fakeStoreProductDTO.setDescription(description);
        fakeStoreProductDTO.setImage(image);
        fakeStoreProductDTO.setCategory(category);

       FakeStoreProductDTO fakeStoreProductDTO1= restTemplate.postForObject("https://fakestoreapi.com/products",
                                    fakeStoreProductDTO,
                                    FakeStoreProductDTO.class);
        return fakeStoreProductDTO1.toproduct();
    }
}
