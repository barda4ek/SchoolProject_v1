package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eight {




    public static int k;
    public ArrayList<Integer> array = new ArrayList<>();

    public int cunter(int k) {

        int num = 0;
        int x = 0;
        int counter = 0;

        while (num < 1000000) {
            if ( (Eight.isTinyNum(x * k)) && ((k*x)>99999)) {
                counter++;
                int numm = k*x;
                array.add(numm);
            }
            num = x * k;
            x++;
        }

        System.out.println("Число красивых элементов от k= " + k + " равно: " + counter);
        return counter;
    }


    //метод, прогоняющий все числа от введённого
    public static boolean isTinyNum(int num) {

        List<Integer> array = Eight.convertToArray(num);
        return isTiny(array);
    }

    //метод понимающий, что число - стройное
    public static boolean isTiny(List<Integer> array) {
        return ( (isTinyUp(array))  );
    }

    public static boolean isTinyUp(List<Integer> array) {
        int length = array.size();
        int x = 0;
        while ((x < (length - 1)) && (array.get(x) > array.get(x + 1))) {
            x++;
        }
        return x == length - 1;
    }

    public static boolean isTinyDown(List<Integer> array) {
        int length = array.size();
        int x = 0;
        while ((x < (length - 1)) && (array.get(x) < array.get(x + 1))) {
            x++;
        }
        return x == length - 1;
    }


    //метод, понимающий красивое ли оно
    public static List<Integer> convertToArray(int num) {

        String string = String.valueOf(num);
        int length = String.valueOf(num).length();

        List<Integer> array = new ArrayList<>(length);
            int x = 0;
            while ( x < length )
                {
                    char[] string2 = string.toCharArray();
                    int y = Character.getNumericValue(string2[x]);
                    array.add(y);
                    x+=1;
                }
            System.out.println("Шо мы записали как эррэй: " + array);
            return array;
    }

    //метод, принимающий число
    public void getNumber() {
        System.out.println("Введите число k от 0 до 1000: ");
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        input.close();
        System.out.println("k = " + num);
        k = num;
    }

    @FunctionalInterface
    interface Countable {
        boolean calculate(int num);
    }


}
