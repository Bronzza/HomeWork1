package com.company.repin;

public class Romb {
    public static void makeRomb(int sideLenght) {
        for (int i = 1; i <= sideLenght; i++) {
            System.out.println();
            for (int j = 0; j < sideLenght * 2 - 1; j++) {
                if (i == 1) {
                    System.out.print(j < sideLenght - 1 ? " " : "*");
                    continue;
                }
                if (i == sideLenght) {
                    System.out.print(j < sideLenght ? "*" : " ");
                    continue;
                }
                System.out.print((j == sideLenght - i) || (j == sideLenght *2-1 - i) ? "*" : " ");
            }
        }
    }
}
