package org.example;

import java.io.Console;
import java.io.IOException;
import java.lang.constant.Constable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       /* check merge 5 branch
        test for main*/
        Car car = new Car("aaa", 111);

        Scanner scan = new Scanner(System.in);
        car.met1(scan);
        car.met2(scan);

        System.in.close();
    }

}