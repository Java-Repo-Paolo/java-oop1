package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your account name: ");
        String choiceAccount = scanner.nextLine();

        Account accountOne = new Account("Paolo", 0.0);

        boolean quit = false;
        while(!quit){
            System.out.println("Welcome " + accountOne.getName() + "\n" + "Code account: " + accountOne.getAccount());
            //System.out.println("Your current balance is: " + accountOne.getBalance());
            System.out.println("Choose an option: ");
            System.out.println("1 - Pay a sum");
            System.out.println("2 - Withdraw a sum");
            System.out.println("3 - Exit");

            System.out.println("Write the chosen option: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("How much do you want to pay?");
                    double balanceIncreased = scanner.nextDouble();
                    accountOne.increaseBalance(balanceIncreased);
                    if (balanceIncreased < 0){
                        System.out.println("I'm sorry, the action failed, please try again");
                    }else {
                        System.out.println(
                            "\n" +
                            "The amount entered has been credited to the current account"
                        );
                        System.out.println(
                            "\n" +
                            "Your current balance is: " +
                            accountOne.getBalance() +
                            " €" +
                            "\n"
                        );

                    }
                    break;
                case 2:
                    System.out.println("How much do you want to withdraw?");
                    double balanceDiminish = scanner.nextDouble();
                    accountOne.diminishBalance(balanceDiminish);
                    if (accountOne.getBalance() < balanceDiminish){
                        System.out.println(
                            "\n" +
                            "Insufficient funds" +
                            "\n");
                    }else {
                        System.out.println("\n" + "The amount entered was withdrawn from the current account");
                        System.out.println(
                            "\n" +
                            "Your current balance is: " +
                            accountOne.getBalance() +
                            " €" +
                            "\n"
                        );
                    }
                    break;
                case 3:
                    quit = true;  // Esci dal ciclo
                    System.out.println(
                        "\n" +
                        "Thank you and good day" +
                        "\n"
                    );
                    break;
                default: System.out.println("I'm sorry, the action failed, please try again");
            }
        }
    }
}

