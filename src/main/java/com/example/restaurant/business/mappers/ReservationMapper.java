package com.example.restaurant.business.mappers;

import com.example.restaurant.business.Reservation.Reservation;
import com.example.restaurant.jpa.ReservationEntity;

public class ReservationMapper {
    
    public static ReservationEntity fromBusinessToEntity(Reservation reservation){
        ReservationEntity entity =new ReservationEntity(
            reservation.getNombreCouverts(), 
            reservation.getHoraire(),
             reservation.getPrenom(), reservation.getNom());

             return entity;
    }
}
