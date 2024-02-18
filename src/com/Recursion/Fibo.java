package com.Recursion;

public class Fibo {
    public static void main(String[] args) {
        int ans  = fibo(6);
        System.out.println(ans);
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
