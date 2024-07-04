package com.example.fooddelivery.fd.service;

import com.example.fooddelivery.fd.model.Category;
import com.example.fooddelivery.fd.model.Food;
import com.example.fooddelivery.fd.model.Restaurant;
import com.example.fooddelivery.fd.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    public List<Food> getRestaurantsFood(Long restaurantId,
                                         boolean isVegetarian,
                                         boolean isNonveg,
                                         boolean isSeasonal,
                                         String foodCategory);
    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws Exception;

    public Food updateAvailiblilityStatus(Long foodId)throws Exception;
}
