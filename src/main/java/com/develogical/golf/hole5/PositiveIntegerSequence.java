package com.develogical.golf.hole5;/*Created on 05/10/17. */

import java.util.Iterator;

public class PositiveIntegerSequence {
    private Sequence sequence;

    PositiveIntegerSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    int term(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Sequence undefined for negative index");
        } else {
            return sequence.term(n);
        }
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private int currentIndex = 0;

            public boolean hasNext() {
                return true;
            }

            public Integer next() {
                int result = term(currentIndex);
                currentIndex++;
                return result;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
