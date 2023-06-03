package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        double disc = b * b - 4 * a * c;
        if (disc > 0) {
            double x1 = (-b + Math.sqrt(disc)) / (2 * a);
            double x2 = (-b - Math.sqrt(disc)) / (2 * a);
            return String.format("%s %s", x1, x2);
        } else if (disc == 0) {
            double x = (-b) / (2 * a);
            return String.format("%s", x);
        } else {
            return "no roots";
        }
    }
}
