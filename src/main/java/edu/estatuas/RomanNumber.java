package edu.estatuas;

import java.util.regex.Pattern;

public class RomanNumber {
    private String romanNumber;
    private Pattern regex = Pattern.compile();




    RomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public Integer toDecimal() {
        regex.matcher(romanNumber).find();
    }


}
