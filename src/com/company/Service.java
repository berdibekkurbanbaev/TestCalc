package com.company;

import java.util.ArrayList;

public class Service {
    static boolean chapter(String nam) throws Exception {

        ArrayList<String> roman = new ArrayList<>();
        roman.add("0");
        roman.add("I");
        roman.add("II");
        roman.add("III");
        roman.add("IV");
        roman.add("V");
        roman.add("VI");
        roman.add("VII");
        roman.add("VIII");
        roman.add("IX");
        roman.add("X");
        for (String rom : roman) {
            if (nam.equals(rom)) {
                return true;
            }
        }
        return false;

    }
    public static String convertNumToRoman(int numArabian) {
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
        final String s = roman[numArabian];
        return s;
    }

    static int romanToNumber(String roman){

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

        throw new RuntimeException("try again:");

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
            throw new RuntimeException("Неверный формат данных!");
        }

        return result;
    }
    static  void arabicCalc(String numbr1, String numbr2,String simbols )throws Exception{

        int numbr3,numbr4,result;
        numbr3 = Integer.parseInt(numbr1);
        numbr4 = Integer.parseInt(numbr2);
        result = Service.calculated(numbr3, numbr4, simbols);
        System.out.println("Result in Arabic num ");
        System.out.println( numbr3+" "+simbols+' '+numbr4 +" = "+ result);

    }
    static void romanCalc(String nam, String nam1, String simbol) throws Exception {
        int nambr1, nambr2, result1;

            nambr1 = Service.romanToNumber(nam);
            nambr2 = Service.romanToNumber(nam1);

            System.out.println("Result in Roman num");
            result1 = Service.calculated(nambr1, nambr2, simbol);
            String result =Service. convertNumToRoman(result1);
            String num1 = Service.convertNumToRoman(nambr1);
            String num2 = Service.convertNumToRoman(nambr2);
            System.out.println(num1 + " " + simbol + " " + num2 + " = " + result);

    }
}
