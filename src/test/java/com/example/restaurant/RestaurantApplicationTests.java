package com.example.restaurant;

//import org.hibernate.mapping.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.restaurant.business.Reservation.Reservation;
import com.example.restaurant.business.Restaurant.Restaurant;
import com.example.restaurant.business.mappers.ReservationMapper;
import com.example.restaurant.business.mappers.RestaurantMapper;
import com.example.restaurant.jpa.ReservationEntity;
import com.example.restaurant.jpa.RestaurantEntity;
import com.example.restaurant.jpa.RestaurantRepositoty;
import java.util.*;
import java.time.LocalDateTime;

@SpringBootTest
class RestaurantApplicationTests {
    
	@Autowired
	RestaurantRepositoty restaurantRepositoty;
	@Test
	void testRestaurant() {
		Restaurant monRestaurant= Restaurant.creationDeNotreRestaurant();
		RestaurantEntity entity = RestaurantMapper.fromBusinessToEntity(monRestaurant);
		restaurantRepositoty.save(entity);


	}

	@Test
	void testLireRestaurant(){
		List<RestaurantEntity> restaurants =restaurantRepositoty.findAll();
		for (RestaurantEntity r: restaurants){
			System.out.println(r);
		}
	}

	@Test
	void testReservation(){
				Reservation reservation = new Reservation(4, 
		LocalDateTime.of (2023, 6, 21, 10, 0), 
		"Michel", "Dupont");

		ReservationEntity entity = ReservationMapper.fromBusinessToEntity(reservation);
	}

}
