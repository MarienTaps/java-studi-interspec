package com.example.restaurant.business.mappers;

import com.example.restaurant.business.Restaurant.Restaurant;
import com.example.restaurant.jpa.RestaurantEntity;

public class RestaurantMapper {
    
    public static RestaurantEntity fromBusinessToEntity(Restaurant restaurant){
        RestaurantEntity entity= new RestaurantEntity();
        entity.setAdresse(restaurant.getAdresse());
        entity.setNom(restaurant.getNom());
        entity.setEmail(restaurant.getEmail());
        entity.setTelephone(restaurant.getTelephone());
        return entity;
    }
}
