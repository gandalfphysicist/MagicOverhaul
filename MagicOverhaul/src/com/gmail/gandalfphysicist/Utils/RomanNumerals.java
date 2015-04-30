package com.gmail.gandalfphysicist.Utils;

public class RomanNumerals {

    public static String getRomanNumeral(int Level) {
        String roman = "";
        int repeat;
        int magnitude[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int x = 0; Level > 0; x++) {
            repeat = Level / magnitude[x];
            for (int i = 1; i <= repeat; i++) {
                roman = roman + symbol[x];
            }
            Level = Level % magnitude[x];
        }
        return roman;
    }

    public static int getIntFromRoman(String RomanNumerals) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = RomanNumerals.toUpperCase();
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = CheckRoman(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = CheckRoman(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = CheckRoman(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = CheckRoman(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = CheckRoman(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = CheckRoman(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = CheckRoman(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        return decimal;
    }

    private static int CheckRoman(int TotalDecimal, int LastRomanLetter, int LastDecimal) {
        if (LastRomanLetter > TotalDecimal) {
            return LastDecimal - TotalDecimal;
        } else {
            return LastDecimal + TotalDecimal;
        }
    }

}
