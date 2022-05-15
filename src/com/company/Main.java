package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите операцию ");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String numbers = scanner.nextLine();

            String[] massiv = numbers.split(" ");
            String number1 = massiv[0];
            String symbol = massiv[1];
            String number2 = massiv[2];


            try {
                if (Service.subj(number1) && Service.subj(number2)) {
                    Service.romanCalc(number1, number2, symbol);
                } else {
                    Service.arabicCalc(number1, number2, symbol);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
    }
}