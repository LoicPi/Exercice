package com.loic.Exo5;

public class Multi {

    public void nombreChoisi() {

        System.out.println("Quel est le nombre choisi ?");
    }

    public static void mult (int x) {

        int i = x%3;
        int j = x%5;

        if ((i == 0)&&(j!= 0)) {
            System.out.println("Fizz");
        } else {
            if ((i != 0)&&(j == 0)) {
                System.out.println("Buzz");
            } else {
                if ((i == 0)&&(j == 0)) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("null");
                }
            }
        }
    }
}
