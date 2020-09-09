package com.company;

import java.util.*;
import java.util.Iterator;

public class Main  {


    public static void main(String[] args) {
        String Lastname,name;
        int age,bribesize;
        boolean bribe_taker;

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the data of deputy");
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

            


            Deputy deputy = new Deputy(Lastname,name,age,bribe_taker,bribesize);
            Deputy deputy1 = new Deputy(Lastname1,)
            deputy.givebribe();

            List<Deputy> list = new LinkedList<>();
            list.add(deputy);

            for(Iterator<Deputy> iterator = list.iterator();iterator.hasNext();){
                String tmp = String.valueOf(iterator.next());
                if(tmp.contains("true")){
                    iterator.remove();
                    System.out.println("Депутата хабарника видалено з фракції");
                }


            }
        System.out.println(list);







    }


}
