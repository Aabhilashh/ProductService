package dev.abhi.productservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class product {

    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private Category category;
    }
