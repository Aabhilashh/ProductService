package dev.abhi.productservice.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter

public class product {

    private id;
    private String title;
    private String decription;
    private int price;
    private String imageUrl;

    }
