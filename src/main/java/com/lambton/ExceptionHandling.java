package com.lambton;

public class ExceptionHandling {

    public static void main(String[] args)
    {
        int a= 100;
        int b=0;
        int c;

        int[] x={1,2,3};




        System.out.println("Start");

        try {
            x[4]=1000;
            c = a / b;
            System.out.println("C : " + c);

        } catch (ArithmeticException  ae) {
            System.out.println("Value of b = 0, Divisible by 0 error");
        }
        catch (ArrayIndexOutOfBoundsException  aob) {
            System.out.println("Array x is is trying to access  index which is out of bound");
        }
        catch (Exception ae) {
            System.out.println(ae.getMessage());
        }
        finally {
            System.out.println("I am in finally block");
        }

        System.out.println("End");
    }


}
