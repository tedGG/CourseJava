package com.company;

public class Main {

    public static void main(String[] args) {

        evklid(252,105);
      int k =  ser(252,105);

      /*System.out.println(k);*/
    }
    public static void evklid(int a, int b){

        while (b != 0) {
            if(a>b){
                a = a-b;
            }else
                b = b-a;

        }
        System.out.println(a + b);


    }
    public static int ser(int j, int s){
        int term = j % s;
        return term;

    }
}
