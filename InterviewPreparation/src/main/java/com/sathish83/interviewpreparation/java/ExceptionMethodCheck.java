package com.sathish83.interviewpreparation.java;

public class ExceptionMethodCheck {

    int method2(){

        try{
            int a = 20;
            int b = a/0;
        }catch(ArithmeticException e){
            System.out.println("Exception caught at method2"+ e);
            return 1;
        }finally {
            System.out.println("finall called at method2");
        }
        return 2;
    }


    void method1(){

        try{
            System.out.println(method2());
        }catch(Exception e){
            System.out.println("Exception caught at method1"+ e);
        }finally {
            System.out.println("finall called at method1");
        }

    }


    public static void main(String[] args) {
         ExceptionMethodCheck e = new ExceptionMethodCheck();
         e.method1();
    }
}
