package com.ryasale;

import javaslang.Function1;
import javaslang.Function2;

/**
 * Created by Ryasale on 10.06.2015.
 */
public class Main {

    final static Integer oldSum(Integer a, Integer b) {
        return a + b;
    }

    final static Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;

    public static void main(String[] args) {
        System.out.println("sum = " + sum.apply(1, 3));
        System.out.println("oldSum = " + oldSum(1, 3));
    }
}
