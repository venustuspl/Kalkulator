package com.kalkulator.demo;


class Calculator {
    private double a;
    private double b;


    public static double addMethod(double a, double b) {
        return a + b;

    }

    public static double minusMethod(double a, double b) {
        return a - b;

    }

}


class Kalkulator {
    public static void main(String[] args) {


        System.out.println(Calculator.addMethod(4, 5));
        System.out.println(Calculator.minusMethod(4, 5));
    }
}

