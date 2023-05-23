package com.example.restaurant.RestaurantUnitTests;
import org.junit.jupiter.api.Test;

import com.example.restaurant.business.Restaurant.Restaurant;

public class RestaurantUnitTests {
    
    
	@Test
	void testCreationRestaurant() {
        Restaurant restaurant= Restaurant.creationDeNotreRestaurant();
        System.out.println(restaurant);
	}
}
