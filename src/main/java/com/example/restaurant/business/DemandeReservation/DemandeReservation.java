package com.example.restaurant.business.DemandeReservation;

import java.time.LocalDateTime;

public class DemandeReservation {
    private int nombreCouverts;
    private LocalDateTime horaire;
    private String prenom;
    private String nom;

    public DemandeReservation(){

    }
    
    public DemandeReservation(int nombreCouverts, LocalDateTime horaire, String prenom,String nom){
        this.nombreCouverts  =nombreCouverts;
        this.horaire= horaire;
        this.prenom =prenom;
        this.nom=nom;
    }


    public int getNombreCouverts(){
        return nombreCouverts;
    }

    public void setNombreCouverts(int nombreCouverts){
        this.nombreCouverts = nombreCouverts;
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
