package org.lessons.java.bank;

import java.util.Random;

public class Account {
    //Attributi
    private int account;
    private String name;
    private double balance;

    //Costruttori
    public Account(String name, double balance){
        Random random = new Random();
        this.account = random.nextInt(100000);
        this.name = name;
        this.balance = balance;
    }

    //Metodi - Getter e Setter

    //Numero di conto
    public int getAccount() {
        return account;
    }
    //Nome
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    //Saldo
    public double getBalance() {
        balance = 0.0;
        return balance;
    }
    //Metodi per Aumentare o Diminuire il conto
    public void increaseBalance(double amount){
        balance += amount;
    }
    public void diminishBalance(double amount){
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
