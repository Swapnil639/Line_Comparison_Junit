package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineComparisonTest {
    LineComparison obj = new LineComparison();

    @Test
    public void givenInputCalculatedLengthOfLines() {
        double res = obj.lengthOfLineCalculation(1.2, 2.2, 3.2, 4.2);
        Assertions.assertEquals(1.4142135623730951, res);
    }

}
