package com.gmail.gandalfphysicist.Utils;

public class RomanNumerals {

    public static String getRomanNumeral(int Level) {
        String roman="";
        int repeat;
        int magnitude[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbol[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int x=0; Level>0; x++){
            repeat=Level/magnitude[x];
            for(int i=1; i<=repeat; i++){
                roman=roman + symbol[x];
            }
            Level=Level%magnitude[x];
        }
        return roman;
    }

}
