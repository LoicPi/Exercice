package com.loic.Exo7;

public class MaxWord {

    public void phraseChoisi() {

        System.out.println("Donnez moi une phrase ?");
    }

    public void wordMax (String str) {
        String[] splitArray = null;
        splitArray = str.split(" ");

        String max = "";

        int j = splitArray[0].length();

        for (int i = 1; i < splitArray.length ; i++) {
            if (j < splitArray[i].length()) {
                j = splitArray[i].length();
                max = splitArray[i];
            }
        }
        System.out.println("Le mot le plus long est : " + max);
    }
}
