package com.godel.impl.factorial;

import com.godel.api.Calculate;

import java.math.BigInteger;

public class Factorial implements Calculate {
    private final int n ;

    public Factorial() {
        this.n = 100;
    }

    @Override
    public String calculate() {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return String.format("FACTORIAL: %s", result);
    }
}
