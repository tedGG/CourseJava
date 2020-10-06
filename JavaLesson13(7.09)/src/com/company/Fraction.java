package com.company;

import java.util.*;

public class Fraction{
    static ArrayList<Deputy> listDelegate =  new ArrayList<>();

    static String Lastname,name;
    static int age,bribesize;
    static boolean bribe_taker;
    static String fraction;

    public Fraction(String nameFraction) {
    }


    public static void addDelegate(){

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the data of deputy");

        System.out.println("Enter fraction: ");
        fraction = scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter lastname: ");
        Lastname = scanner.nextLine();
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        System.out.println("Enter bribe: ");
        bribesize = scanner.nextInt();
        System.out.println("Enter whether the deputy is a bribe-taker");
        bribe_taker = scanner.nextBoolean();

        Deputy deputy =  new Deputy(Lastname,name,age,bribe_taker,bribesize,fraction);

        ArrayList<Deputy> listDelegate = new ArrayList<>();
        listDelegate.add(deputy);
        System.out.println(listDelegate);


    }

    public  static void deleteDelegate() {
        Deputy deputy =  new Deputy(Lastname,name,age,bribe_taker,bribesize,fraction);
        ArrayList<Deputy> listDelegate =  new ArrayList<>();
        listDelegate.add(deputy);

        for (Iterator<Deputy> iterator = listDelegate.iterator(); iterator.hasNext();) {
            String tmp = String.valueOf(iterator.next());
            if (tmp.contains("true")) {
                iterator.remove();
                System.out.println("Delegate "+deputy.getLastname()+" is bribe-taker");
            }else System.out.println("Delegate "+deputy.getLastname()+" is not bribe-taker");

        }



    }
    public  static void showBribetakers(){
        Deputy deputy =  new Deputy(Lastname,name,age,bribe_taker,bribesize,fraction);
        ArrayList<Deputy> listDelegate =  new ArrayList<>();
        listDelegate.add(deputy);

        Iterator<Deputy> delegatebribetaker = listDelegate.iterator();
        while (delegatebribetaker.hasNext()){
            if(deputy.isBribe_taker()){
                System.out.println(delegatebribetaker.next());
            }

        }
    }
    public static void showThebiggestBribetaker(){
        addDelegate();
        listDelegate.sort(new BribesizeComparator());
        System.out.println("The biggest bribe-taker: " + listDelegate);

    }
    public static void showalldelegates(){
        addDelegate();
        Deputy deputy =  new Deputy(Lastname,name,age,bribe_taker,bribesize,fraction);
        ArrayList<Deputy> listDelegates =  new ArrayList<>();
        listDelegates.add(deputy);

        for (Iterator<Deputy> iterator = listDelegates.iterator(); iterator.hasNext();) {
            Deputy deputy1 = iterator.next();
            System.out.println(deputy1);

     }
    }
}
