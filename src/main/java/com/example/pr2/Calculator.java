package com.example.pr2;

public class Calculator {

    public int sum(int a,int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int absolute(int a){
        if (a<0){
            return a*-1;
        }
        else {
            return a;
        }
    }

    public double division (double a, double b){
        if (b == 0){
            throw new ArithmeticException();
        }
        return a/b;
    }

    public int minus (int a, int b){
        return a-b;
    }

    public int square(int a){
        return a*a;
    }
}
