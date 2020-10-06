package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Verkhovnarada {
    ArrayList<Fraction> fractionArrayList = new ArrayList<>();
   
    

    public void addFraction(){

        System.out.println("Enter name fraction");
        Scanner scanner =  new Scanner(System.in);
        String nameFraction = scanner.nextLine();
        Fraction fraction = new Fraction(nameFraction);
        fractionArrayList.add(fraction);

    }
    public void deleteFraction(){


        Iterator<Fraction> fractionIterator = fractionArrayList.iterator();
        while (fractionIterator.hasNext()) {
            fractionIterator.next();
            fractionIterator.remove();
            System.out.println(fractionIterator);
        }

    }
    public void showallfraction(){

    }
    public void removeFraction(){
        Scanner scanner =  new Scanner(System.in);
        int i = scanner.nextInt();
        fractionArrayList.remove(i);
        System.out.println(fractionArrayList);
    }
    public void showFraction(){
        Iterator<Fraction> fractionIterator = fractionArrayList.iterator();
        while (fractionIterator.hasNext()){
            fractionIterator.next();
        }
    }

}
