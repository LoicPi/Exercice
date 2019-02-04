package com.loic.Exo3;

public class Inversion {

    public void phraseChoisi() {

        System.out.println("Donnez moi une phrase ?");
    }

    public void inversionChaine(String str){
        char [] tab = str.toCharArray();
        int x = tab.length;
        char[] bat = new char[x];

        for (int i = 0 ; i < tab.length ; i++){
            bat[i] = tab[(x-1)-i];
        }
        String rts = String.valueOf(bat);
        System.out.println("Voici votre phrase à l'envers : " + rts);


    }
}
