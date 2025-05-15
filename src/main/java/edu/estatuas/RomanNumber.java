package edu.estatuas;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static edu.estatuas.LeterNumber.getRomanValue;

public class RomanNumber {
    private String romanNumber;
    private Pattern sumRegex = Pattern.compile("[MCDXLIV]");
    private Pattern substractRegex = Pattern.compile("CM|CD|XC|XL|IX|IV");





    RomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public short toDecimal() {
        return (short) (substractRomanNumber() + sumRomanNumber());
    }

    private short substractRomanNumber() {
        short total = 0;
        Matcher matcher = substractRegex.matcher(romanNumber);
        while (matcher.find()) {
            total += getRomanValue(matcher.group());
        }
        return total;
    }


    private short sumRomanNumber() {
        short total = 0;
        Matcher matcher = sumRegex.matcher(romanNumber);
        while (matcher.find()) {
            total += getRomanValue(matcher.group());
        }
        return total;
    }



}
