package com.company;

public class Methods {
    public int Add(int a, int b){
        if ((b < 0)) {
            throw new IllegalArgumentException("b is < 0");
        }
        return a / b;
    }
    public int Subtract(int a,int b){
        if(b!=0){
            throw new ArithmeticException("b != 0");
        }else
            return a - b;
    }
    public int multiplication(int a, int b){
        if(a!=0){
            throw new ArithmeticException("a != 0");
        }else
            return a * b;
    }
    public void Divide(int a,int b) throws IllegalAccessException {
        if(a==0||b==0){
            throw new IllegalAccessException("a == 0 and b == 0");
        }
    }
    public void devideandadd(int a,int b,int k) throws MyException {
            if(a<5){
                throw new MyException("a<5");
            }else
                System.out.println(a/b+k);
    }
}
