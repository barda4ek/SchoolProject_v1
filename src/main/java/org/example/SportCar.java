package org.example;

import org.junit.jupiter.api.Test;

public class SportCar extends Car{

    SportCar(String name, int cost) {
        super(name, cost);
    }



    public void setNewCost(int a) {
        this.cost = a + 777;
    }




}
