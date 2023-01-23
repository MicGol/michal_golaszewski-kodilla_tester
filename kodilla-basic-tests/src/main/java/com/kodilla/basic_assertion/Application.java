package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[]args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subtractResult = calculator.subtract(a, b);
        boolean correctSub = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSub) {
            System.out.println("Metoda działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb " + a + " i " + b);
        }
        double increase = (double) calculator.increase(a);
        boolean correctInc = ResultChecker.assertEquals(25, (int) increase);
        if (correctInc) {
            System.out.println("Metoda działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczby " + a);
        }
    }
}
