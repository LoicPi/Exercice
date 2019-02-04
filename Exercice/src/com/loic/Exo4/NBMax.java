package com.loic.Exo4;

public class NBMax {

    public static int plusGrandNombre (int a[]){

        int j = a[0];

        for (int i = 1 ; i<a.length; i++){
            if ( j < a[i]){
                j=a[i];
            }
        }
        return j;
    }
}
