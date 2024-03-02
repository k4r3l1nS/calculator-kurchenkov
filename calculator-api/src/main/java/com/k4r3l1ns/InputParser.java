package com.k4r3l1ns;

import java.math.BigDecimal;

public class InputParser {

    public static BigDecimal toDecimal(String input) {
        return BigDecimal.valueOf(Double.parseDouble(input));
    }
}
