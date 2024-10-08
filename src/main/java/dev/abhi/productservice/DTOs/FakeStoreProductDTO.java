package dev.abhi.productservice.DTOs;


import com.fasterxml.jackson.annotation.JsonProperty;
import dev.abhi.productservice.models.Category;
import dev.abhi.productservice.models.product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreProductDTO {
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;




    public product toproduct() {
        product product = new product();
        product.setId(id);
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setImage(image);

        Category category1 = new Category();
        category1.setTitle(category);



        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Image URL: " + image);
        System.out.println("Category: " + category);

        product.setCategory(category1);

        return product;
    }
}
