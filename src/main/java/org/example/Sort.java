package org.example;

import java.util.Comparator;

public class Sort implements Comparator<Rational> {

    @Override
    public int compare(Rational r1, Rational r2) {
        return Integer.compare(r1.getNumerator() / r1.getDenominator(), r2.getNumerator() / r2.getDenominator());
    }
}
