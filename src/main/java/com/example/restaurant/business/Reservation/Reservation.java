package com.example.restaurant.business.Reservation;

import java.time.LocalDateTime;


import com.example.restaurant.business.Table.Table;

public class Reservation {
    private int nombreCouverts;
    private LocalDateTime horaire;
    private String prenom;
    private String nom;
    private Table table;

    public Reservation(){
        
    }

    public Reservation(int nombreCouverts, LocalDateTime horaire, String prenom, String nom){
        this.nombreCouverts =nombreCouverts;
        this.horaire =horaire;
        this.prenom =prenom;
        this.nom = nom;

    }

    public Table getTable(){
        return table;
    }
    
    public void setTable(Table table){
        this.table=table;
    }

    @Override
    public String toString(){
        return "DemandeReservation {" +
               "nombreCouverts =" + nombreCouverts +
               ", horaire= " + horaire  + 
               ", prenom = '" + prenom + '\''+
         ", nom='" + nom + '\''+ '}';
    }


}
