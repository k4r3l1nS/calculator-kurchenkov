package com.k4r3l1ns;

import java.math.BigDecimal;

import static com.k4r3l1ns.InputParser.toDecimal;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2) {
            throw new RuntimeException("Invalid number of args");
        }

        BigDecimal x = toDecimal(args[0]);
        BigDecimal y = toDecimal(args[1]);

        System.out.println(CalculationCore.sum(x, y));
    }
}
