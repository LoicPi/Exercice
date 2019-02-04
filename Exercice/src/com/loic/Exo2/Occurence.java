package com.loic.Exo2;

public class Occurence {

    public void nombreChoisi() {

        System.out.println("Quel est le nombre choisi ?");
    }

    public static int nombreRecherche (int tableau[], int x) {



        for (int i = 0 ; i < tableau.length ; i++) {
            if (tableau[i] == x) {
                return i;
            }
        }

        return -1;

    }
}
