package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationNoRootsCasesTesting {

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a;
    private double b;
    private double c;

    public QuadraticEquationNoRootsCasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        List<Object[]> testCases = new ArrayList<>();
        testCases.add(new Object[]{1, 2, 3});
        testCases.add(new Object[]{2, 5, 7});
        testCases.add(new Object[]{3, 6, 9});
        testCases.add(new Object[]{1, 0, 4});
        return testCases;
    }

    @Test
    public void testNoRootsCase() {
        assertEquals("no roots", quadraticEquation.solve(a, b, c));
    }

}
