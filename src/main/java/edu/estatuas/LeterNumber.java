package edu.estatuas;

public enum LeterNumber {
    M(1000, "M"),
    D(500, "D"),
    C(100, "C"),
    L(50, "L"),
    X(10, "X"),
    V(5, "V"),
    I(1, "I"),
    CM(900, "CM"),
    CD(400, "CD"),
    XC(90, "XC"),
    XL(40, "XL"),
    IX(9, "IX"),
    IV(4, "IV");

    private final int number;
    private final String name;

    LeterNumber(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

}
