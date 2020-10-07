package com.company;

import java.util.*;

public class Comodity {
    static String nameComodity;
    static int lenght;
    static int width;
    static int weight;
    static ArrayList<Comodity> list = new ArrayList<>();
    static Comodity comodity =  new Comodity(nameComodity,lenght,width,weight);

    public Comodity(String nameComodity, int lenght, int width, int weight) {
        this.nameComodity = nameComodity;
        this.lenght = lenght;
        this.width = width;
        this.weight = weight;
    }

    public static void addComodity(){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Add comodity: ");
        nameComodity = scanner.nextLine();
        System.out.println("Enter lenght: ");
        lenght = scanner.nextInt();
        System.out.println("Enter width: ");
        width = scanner.nextInt();
        System.out.println("Enter weight: ");
        weight = scanner.nextInt();

        list.add(comodity);
        System.out.println(list);
    }
    public static void DeleteComodity(){
        addComodity();
        list.add(comodity);
        if(comodity.getLenght()>30){
            list.remove(comodity);
            System.out.println("Comodity is deleted");
        }

    }
    public static void ReplaceComodity(){

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter new values");
        int value = scanner.nextInt();
        System.out.println("Add comodity: ");
        nameComodity = scanner.nextLine();
        System.out.println("Enter lenght: ");
        lenght = scanner.nextInt();
        System.out.println("Enter width: ");
        width = scanner.nextInt();
        System.out.println("Enter weight: ");
        weight = scanner.nextInt();


        list.set(value,comodity);




    }
    public static void SortName(){

        list.sort(new SortNameComparator());
        System.out.println(list);

    }

    public static void SortLenght(){

        list.sort(new SortInt());
        System.out.println(list);
    }
    public static void SortWidth(){
        list.sort(new SortInt());
        System.out.println(list);
    }
    public static void SortWeight(){
        list.sort(new SortInt());
        System.out.println(list);
    }
    public static void ShowiElement(){
            Scanner scanner =  new Scanner(System.in);
            int index =  scanner.nextInt();
            ListIterator<Comodity> iterator = list.listIterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
                Comodity nextWithIndex = list.get(index);
                System.out.println(nextWithIndex);
            }
    }

    public String getNameComodity() {
        return nameComodity;
    }

    public void setNameComodity(String nameComodity) {
        this.nameComodity = nameComodity;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "NameCommodity: " + nameComodity + ", " + "Length: " + lenght + ", " + "Widht: " + width + ", " + "Weight: " + weight+".";
    }

}
