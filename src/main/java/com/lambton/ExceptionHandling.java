package com.lambton;

public class ExceptionHandling {

    public static void main(String[] args)
    {
        int a= 100;
        int b=0;
        int c;
        System.out.println("Start");

        try {

            c = a / b;
            System.out.println("C : " + c);

        } catch (ArithmeticException  ae) {
            System.out.println("Value of b = 0, Divisible by 0 error");
        }

        System.out.println("End");
    }


}
