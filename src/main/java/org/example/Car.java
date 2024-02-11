package org.example;

import java.util.Scanner;

public class Car {


    //static Scanner scanner = new Scanner(System.in);

    public String met1(Scanner scan) {
        System.out.println("Введи 1: ");
        return scan.nextLine();
    }

    public String met2(Scanner scan) {
        System.out.println("Введи 2: ");
        String x = scan.nextLine();
        scan.close();
        return x;
    }




    String name;
    int cost;

    int getCost() {
        return this.cost;
    }

    Car(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public void setNewCost(int a) {
        this.cost = a;
    }

}
