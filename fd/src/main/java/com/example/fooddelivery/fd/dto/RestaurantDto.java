package com.example.fooddelivery.fd.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;


import java.util.List;

@Data
@Embeddable
public class RestaurantDto {

    private String title;

    @Column(length = 3000)
    private List<String> images;

    private String description;
    private Long id              ;
}
