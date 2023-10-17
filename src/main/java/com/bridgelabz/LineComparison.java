package com.bridgelabz;


public class LineComparison {
    public double lengthOfLineCalculation(double X1, double X2, double Y1, double Y2) {

        double lengthOfLine = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
        return lengthOfLine;
    }
    public boolean compareTwoLines(double line1, double line2) {

        if (line1 == line2) {
            return true;
        }

        return false;
    }
}
