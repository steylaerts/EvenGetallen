package com.company;

public class Main {

    public static void main(String[] args) {
        int[] aGetallen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++) {
            if (aGetallen[i] % 2 == 0) {
                System.out.println(aGetallen[i]);
            }
        }
        System.out.println("----For Each-----");

        for (int iGetal: aGetallen) {
            if (iGetal % 2 == 0) {
                System.out.println(iGetal);
            }
        }
    }
}
