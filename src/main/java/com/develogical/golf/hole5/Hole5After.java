package com.develogical.golf.hole5;

public class Hole5After {
    public void generate() {
        // Can't use lambdas here because of recursive definition
        PositiveIntegerSequence fibonacciSequence = new PositiveIntegerSequence(new Sequence() {
            @Override
            public int term(int n) {
                return n < 2 ? 1 : term(n - 2) + term(n - 1);
            }
        });
        fibonacciSequence.term(3);
        PositiveIntegerSequence triangularNumberSequence = new PositiveIntegerSequence(n -> (n + 2) * (n + 1) / 2);
        triangularNumberSequence.term(3);
    }
}