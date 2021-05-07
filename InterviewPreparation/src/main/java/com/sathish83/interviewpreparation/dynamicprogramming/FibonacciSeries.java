package com.sathish83.interviewpreparation.dynamicprogramming;

public class FibonacciSeries {
    public int  doFibonacciWithOutDP(int a){

         if(a<2){
             return a;
         }
         return doFibonacciWithOutDP(a-1) + doFibonacciWithOutDP(a-2);
    }

   public int memoizeDpSupporter(int n){
        int memoize[] = new int[n+1];
        return doFibonacciWithDP(memoize,n);
   }

    int doFibonacciWithDP(int memoize[] , int n){
         if(n<2)
             return n;
         if(memoize[n]!=0)
             return memoize[n];
         memoize[n] = doFibonacciWithDP(memoize,n-1) + doFibonacciWithDP(memoize,n-2);
         return memoize[n];
    }

    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        System.out.println("With out Dp"+ fs.doFibonacciWithOutDP(6));
        System.out.println("With Dp" + fs.memoizeDpSupporter(8));
    }

}
