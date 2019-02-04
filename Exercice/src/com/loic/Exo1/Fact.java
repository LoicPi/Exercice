package com.loic.Exo1;

public class Fact{

    public void nombreChoisi() {

        System.out.println("Quel est le nombre choisi ?");
    }


    public int Factorielle(int x) {

        int j = 1;

        if (x==0){
            return 1;
        }
        else {
            for (int i = 1; i <= x ; i++){
                j = j * i;
            }
        }
        return j;
    }
}
