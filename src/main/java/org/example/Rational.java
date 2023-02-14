package org.example;

public class Rational{
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator ;
    }

//    @Override
//    public int compareTo(Rational rational) {
//        return Integer.compare(numerator / denominator, rational.getNumerator() / rational.getDenominator());
//    }
}
