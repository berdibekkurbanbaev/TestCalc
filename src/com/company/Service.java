package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {


    static boolean subj(String symbols) throws Exception {

        ArrayList<String> romanNumb = new ArrayList<>();
        romanNumb.add("0");
        romanNumb.add("I");
        romanNumb.add("II");
        romanNumb.add("III");
        romanNumb.add("IV");
        romanNumb.add("V");
        romanNumb.add("VI");
        romanNumb.add("VII");
        romanNumb.add("VIII");
        romanNumb.add("IX");
        romanNumb.add("X");
        for (String roman : romanNumb) {
            if (symbols.equals(roman)) {
                return true;
            }
        }
        return false;

    }
    public static String convertToRomanNumb(int arabNumb) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII",
                "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI",
                "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII",
                "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[arabNumb];
        return s;
    }

    static int romanNumber(String roman){

        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        }

        throw new RuntimeException("try again!");

    }

    public static int calculated(int a, int b, String c) throws Exception {
        int result = 0;

        if (a > -1 && b <= 10 && b > -1 && a <= 10 && c.equals("+")) {
            result = a + b;

        } else if (a > -1 && b <= 10 && b > 1 && a <= 10 && c.equals("*")) {
            result = a * b;

        } else if (a > -1 && b <= 10 && b > -1 && a <= 10 && c.equals("-")) {
            result = a - b;

        } else if (a > -1 && b <= 10 && b > -1 && a <= 10 && c.equals("/")) {
            result = a / b;

        } else {
            throw new RuntimeException("try again!");
        }

        return result;
    }
    static  void arabicCalc(String numeric1, String numeric2,String simbol )throws Exception{

        int numeric3,numeric4,result;
        numeric3 = Integer.parseInt(numeric1);
        numeric4 = Integer.parseInt(numeric2);
        result = Service.calculated(numeric3, numeric4, simbol);
        System.out.println("Result in Arabic operation: ");
        System.out.println(numeric3+" "+simbol+' '+ numeric4 + " = " + result);

    }
    static void romanCalc(String nam, String nam1, String simbol) throws Exception {
        int nambr1, nambr2, result1;

            nambr1 = Service.romanNumber(nam);
            nambr2 = Service.romanNumber(nam1);

            System.out.println("Result in Roman operation: ");
            result1 = Service.calculated(nambr1, nambr2, simbol);
            String result =Service.convertToRomanNumb(result1);
            String num1 = Service.convertToRomanNumb(nambr1);
            String num2 = Service.convertToRomanNumb(nambr2);
            System.out.println(num1 + " " + simbol + " " + num2 + " = " + result);

    }
}
