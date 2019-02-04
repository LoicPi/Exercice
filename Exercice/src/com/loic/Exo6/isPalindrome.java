package com.loic.Exo6;

public class isPalindrome {

    public void phraseChoisi() {

        System.out.println("Donnez moi une phrase ?");
    }

    public void palin (String str) {
        str = str.toLowerCase();
        String str2 = str.replace(" ", "");
        char[] tab = str2.toCharArray();
        int x = tab.length;
        char[] bat = new char[x];

        for (int i = 0; i < x; i++) {
            bat[i] = tab[(x - 1) - i];
        }

        String s = "";

        for (int j = 0; j<x ; j++) {
            if (tab[j] == bat[j]) {
                s = "C'est un palindrome";
            } else {
                s = "Ce n'est pas un palindrome";
            }
        }
        System.out.println(s);
    }
}
