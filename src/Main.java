package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Lauritz = new Scanner(System.in);
        int første, andet, svar;
        System.out.println("Skriv første nummer: ");
        første = Lauritz.nextInt();
        System.out.println("skriv andet nummer: ");
        andet = Lauritz.nextInt();
        svar = første + andet;
        System.out.println(svar);

    }
}
