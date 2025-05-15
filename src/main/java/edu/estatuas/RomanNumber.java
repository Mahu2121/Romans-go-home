package edu.estatuas;


import java.util.regex.Pattern;

public class RomanNumber {
    private String romanNumber;
    private Pattern sumRegex = Pattern.compile("[MCDXLIV]");
    private Pattern substractRegex = Pattern.compile("CM|CD|XC|XL|IX|IV");





    RomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public short toDecimal() {
        return (short) sumRomanNumber() ;
    }
    /*
    public short sumRomanNumber() {
        if (sumRegex.matcher(romanNumber).find()){
            short total = 0;
            for (int i = 0; i < romanNumber.length(); i++) {
                for (LeterNumber letter : LeterNumber.values()) {
                    if (letter.getName().equals(String.valueOf(romanNumber.charAt(i)))) {
                        total += letter.getNumber();
                    }
                }
            } return total;
        } return 0;
    }

     */
    public short sumRomanNumber() {
        short total = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            for (LeterNumber letter : LeterNumber.values()) {
                if (letter.getName().equals(String.valueOf(romanNumber.charAt(i)))) {
                    total += letter.getNumber();
                }
            }
        } return total;
    }

    /*
    public short substractRomanNumber() {
        if (substractRegex.matcher(romanNumber).find()) {
            short total = 0;
            for (int i = 0; i < romanNumber.length(); i++) {
                for (LeterNumber letter : LeterNumber.values()) {
                    if (letter.getName().equals(String.valueOf(romanNumber.charAt(i)))) {
                        total += letter.getNumber();
                    }
                }
            } return total;
        } return 0;
    }

     */


}
