package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Rational> list = new ArrayList<>();
        list.add(new Rational(1, 2));
        list.add(new Rational(4, 8));
        list.add(new Rational(5, 5));
        list.add(new Rational(3, 2));
        list.add(new Rational(2, 4));
        list.add(new Rational(7, 9));

        Collections.sort(list);

        for (Rational rational: list){
            System.out.println(rational.toString());
        }
    }
}