package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product productOne = new Product("Passata di pomodoro",
                                         "Una passata fatta solo con pomodori italiani",
                                         19.00,
                                         22);
        Product productTwo = new Product("Passata di pomodoro",
                                         "Una passata fatta solo con pomodori italiani",
                                         25.00,
                                         22);
        Product productThree = new Product("Passata di pomodoro",
                                           "Una passata fatta solo con pomodori italiani",
                                           25.00,
                                           22);

        System.out.println(
                            '\n' + "Name/Code: " + productOne.nameCode() +
                            //'\n' + "Name: " + productOne.getName() +
                            //'\n' + "Description: " + productOne.getDescription() +
                            //'\n' + "Price: " + productOne.getPrice() + " €" +
                            '\n' + "Price/Iva: " + productOne.priceIva() + " €"+
                            '\n' +
                            '\n' + "Name/Code: " + productTwo.nameCode() +
                            '\n' + "Name/Code: " + productTwo.priceIva() + " €"+
                            '\n' +
                            '\n' + "Name/Code: " + productThree.nameCode() +
                            '\n' + "Name/Code: " + productThree.priceIva() + " €"
        );

        scanner.close();

    }

}
