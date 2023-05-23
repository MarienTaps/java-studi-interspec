package com.example.restaurant.business.Restaurant;

import java.util.ArrayList;
import java.util.List;

import com.example.restaurant.business.Reservation.Reservation;
import com.example.restaurant.business.Table.Table;
import java.util.List;

public class Restaurant {
    private String nom;
    private String adresse;
    private String telephone;
    private String email;

    private List <Table> tables = new ArrayList<>();
    private List <Reservation> reservations =new ArrayList<>();

    public Restaurant(){

       
    }

    public Restaurant(String nom, String adresse, String telephone, String email){
        this.nom =nom;
        this.adresse=adresse;
        this.telephone=telephone;
        this.email=email;

    }
     
    @Override
    public String toString(){
        return "Restaurant{" +
                "nom='"+ nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='"+ telephone + '\''+
                ", email='"+ email +'\''+
                ", tables= "+ tables+
                ", revervation= "+ reservations +
                '}';
    }
    
    public static Restaurant creationDeNotreRestaurant() {
        Restaurant restaurantMaria = new Restaurant("Chez Maria", "1 rue de la paix",
                   "0412345678", "maria@restaurant.fr");
                   restaurantMaria.ajouerTable(1,6);
                   restaurantMaria.ajouerTable(2, 2);
                   restaurantMaria.ajouerTable(3, 2);
                   restaurantMaria.ajouerTable(4, 4);
        return restaurantMaria;
    }

    private void ajouerTable(int numeroTable, int nombreCouverts){
        tables.add(new Table(numeroTable, nombreCouverts));
    }
}
