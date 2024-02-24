package com.Recursion;

public class Fibo {
    public static void main(String[] args) {
//        int ans  = fibo(6);
//        System.out.println(ans);

        for (int i = 0; i < 11; i++)
        {
            System.out.println(fiboFormula(i));
        }
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n) {
        // just for demo , use long instead
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibo(int n)
    {
        //base condition
        if (n < 2) {
            return n;
        }
        // This is not tail recursion
        // because this is not the last statement that is running by the function
        return fibo(n-1) + fibo(n-2);
    }
}
 