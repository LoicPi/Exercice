package com.loic;

import com.loic.Exo1.Fact;
import com.loic.Exo2.Occurence;
import com.loic.Exo3.Inversion;
import com.loic.Exo4.NBMax;
import com.loic.Exo5.Multi;
import com.loic.Exo6.isPalindrome;
import com.loic.Exo7.MaxWord;

import java.util.Scanner;

public class Main {

/**
 * Exo 1
    public static void main(String[] args) {
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {
            Fact fact = new Fact();
            fact.nombreChoisi();
            Scanner cs = new Scanner(System.in);
            int x = cs.nextInt();
            fact.Factorielle(x);
            System.out.println("Le factoriel de " + x + " est " + fact.Factorielle(x));
            System.out.println("Voulez-vous recommencez ? (O/N)");
            reponse = sc.nextLine().charAt(0);
        }
        System.out.println("Au revoir");
    }
*/

/**
 * Exo2
    public static void main(String[] args) {

            Occurence occurence = new Occurence();
            occurence.nombreChoisi();
            Scanner cs = new Scanner(System.in);
            int x = cs.nextInt();
            int a [] = {1,2,3,5,4};
            int y = Occurence.nombreRecherche( a , x );
            System.out.println(y);

    }
*/

/**
 * Exo 3
    public static void main (String [] args) {
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {
            Inversion inv = new Inversion();
            inv.phraseChoisi();
            Scanner cs = new Scanner(System.in);
            String str = cs.nextLine();
            inv.inversionChaine(str);
            System.out.println("Voulez-vous recommencez ? (O/N)");
            reponse = sc.nextLine().charAt(0);
        }
        System.out.println("Au revoir");
    }
*/

/**
 * Exo4
    public static void main (String[] args) {

        int a[] = {7, 15, 3, 20, 2, 6};
        int x = NBMax.plusGrandNombre(a);
        System.out.println(x);

    }
*/

/**
 * Exo5
    public static void main(String[] args) {
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {
            Multi multi = new Multi();
            multi.nombreChoisi();
            Scanner cs = new Scanner(System.in);
            int x = cs.nextInt();
            Multi.mult(x);
            System.out.println("Voulez-vous recommencez ? (O/N)");
            reponse = sc.nextLine().charAt(0);
        }
        System.out.println("Au revoir");
    }
 */

/**
    public static void main(String[] args){
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {
            isPalindrome palindrome = new isPalindrome();
            palindrome.phraseChoisi();
            Scanner cs = new Scanner(System.in);
            String str = cs.nextLine();
            palindrome.palin(str);
            System.out.println("Voulez-vous recommencez ? (O/N)");
            reponse = sc.nextLine().charAt(0);
        }
        System.out.println("Au revoir");
    }
*/

/**
 * Exo 7&8
    public static void main(String[] args) {
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {
            MaxWord maxW = new MaxWord();
            maxW.phraseChoisi();
            Scanner cs = new Scanner(System.in);
            String str = cs.nextLine();
            maxW.wordMax(str);
            System.out.println("Voulez-vous recommencez ? (O/N)");
            reponse = sc.nextLine().charAt(0);
        }
        System.out.println("Au revoir");
    }
*/
}
