package org.example;

import java.io.Console;
import java.io.IOException;
import java.lang.constant.Constable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Eight program = new Eight();
        program.getNumber();
        program.cunter(k);
        System.out.println(program.array);*/

        //StreamLearn streamClass = new StreamLearn();
        //System.out.println(streamClass.objectPredicate.test(new Car("ba")));


       /* object1.setName("Антон", 555);
        object2.setName("Женя", 777);*/

        //System.out.println(object1.getName() + "\n" + object2.getName() + "\n" + NewClass.newCost);

        /*Car car = new Car("toyota", 50000);
        SportCar sportCar1 = new SportCar("Lexus", 100000);

        sportCar1.setNewCost(40000);
        System.out.println(sportCar1.getCost());*/

        Car car = new Car("aaa", 111);
        Scanner scan = new Scanner(System.in);
        car.met1(scan);
        car.met2(scan);
        System.in.close();


    }




}