package com.example.restaurant.business.Table;



public class Table {
    private int numeroTable;
    private int nombreCouverts;

    public Table(){

    }

    public Table(int numeroTable, int nombreCouverts){
        this.numeroTable = numeroTable;
        this.nombreCouverts= nombreCouverts;
    }
    public int getNumeroTable(){
        return numeroTable;
    }

    public void setNumeroTable(int numeroTable){
        this.numeroTable= numeroTable;
    }

    public int getNombreCouverts(){
        return nombreCouverts;
    }

    public String toString(){
        return "Table {" + "numeroTable =" + numeroTable+ ",nombreCouverts="+ nombreCouverts+ '}';
    }
}
