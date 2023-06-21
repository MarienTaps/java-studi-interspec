package com.example.restaurant.business.Restaurant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.example.restaurant.business.DemandeReservation.DemandeReservation;
import com.example.restaurant.business.Reservation.Reservation;
import com.example.restaurant.business.Table.Table;


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
     
    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom =nom;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    
    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String telephone){
        this.telephone=telephone;
    }

    public String getEmail(){
        return email;
    }


    public void setEmail(String email){
        this.email= email;
    }
    
    public List<Table> getTables(){
        return tables;
    }

    public void setTables(List<Table> tables){
        this.tables =tables;
    }

    public List<Reservation> gReservations(){
        return reservations;
    }

    public void setReservations(List<Reservation> reservations){
        this.reservations=reservations;
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

        tables.sort(Comparator.comparing(Table::getNombreCouverts));
    }
    
    public void ajouterReservation(Reservation reservation){
        reservations.add(reservation);
    }
    public String validerDemandeReservation(DemandeReservation demande){


        if(demande.getHoraire().getHour() < 12){
            return "Le restaurant est ouvert à partir de 12h";
        }
        if(demande.getHoraire().getHour() > 13){
            return "Vous pouvez reserver uniquement pour 12h ou 13h";
        }
        if(demande.getHoraire().getHour()==13 && 
                  demande.getHoraire().getMinute()>0){
                    return "Vous pouvez reserver uniquement pour 12h ou 13h";
                  }
        if(demande.getNombreCouverts() > 6) {
            return "Le nombre de couverts maximum pour une réservation est de 6";
        }
        
        for(Table table: tables){
            if(table.getNombreCouverts() >= demande.getNombreCouverts()){

                Boolean tableDejaReservee =false;
                for(Reservation reservation: reservations){
                    if(reservation.getHoraire().equals(demande.getHoraire()) && 
                    reservation.getTable().getNumeroTable()== table.getNumeroTable())
                    tableDejaReservee=true;

                }
                if(tableDejaReservee){
                    continue;
                }
                else{
                    //OK : on peut reserver cette table
                    Reservation reservation=  new Reservation(demande.getNombreCouverts(), 
                    demande.getHoraire(), demande.getPrenom(), demande.getNom());
                    reservation.setTable(table);
                    ajouterReservation(reservation);
                    return "OK: reservation enregistrée";
                }
            }
        }
         
        return "Désolé, il n'y a plus de tables disponibles";
}
}
