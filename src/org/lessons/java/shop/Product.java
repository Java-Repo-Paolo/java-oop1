package org.lessons.java.shop;

import java.util.Random;

public class Product {

    //Attributi
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;

    //Costruttori
    public Product(String name, String description, double price, int iva){
        Random random = new Random();
        this.code = random.nextInt(100000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    //Metodi - Getter e Setter

    //Codice
    public int getCode() {
        return code;
    }
    //Nome
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //Descrizione
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    //Prezzo
    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    //Iva
    public int getIva() {
        return iva;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }
    //Prezzo + iva
    public double priceIva(){
        this.price = price * (1 + (double) this.iva / 100);
        return price;
    }
    //Nome + Codice
    public String nameCode(){
        return name + ' ' + getCode();
    }


}
