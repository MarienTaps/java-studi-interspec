package com.example.restaurant.RestaurantUnitTests;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.restaurant.business.Restaurant.Restaurant;
//import com.example.restaurant.business.Reservation.Reservation;
//import static org.junit.jupiter.api.Assertions.*;

public class RestaurantUnitTests {
    
    
	@Test
	void testCreationRestaurant() {
        Restaurant restaurant= Restaurant.creationDeNotreRestaurant();
        System.out.println(restaurant);
		//assertEquals(4, restaurant.getTables().size());
	}
}
