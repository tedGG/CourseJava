package com.company;

public class Engine  {
        int numbofcelinders;


    public Engine(int numbofcelinders) {
        this.numbofcelinders = numbofcelinders;
    }

    void infoEngine(){
       numbofcelinders = 16;
       System.out.println("Кількість циліндрів: "+numbofcelinders);
   }


    @Override
    public String toString() {
        return
                "Кількість циліндрів: " + numbofcelinders;
    }
}
