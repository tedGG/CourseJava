package com.company;



import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person();
        FileOutputStream fos = new FileOutputStream("Fields.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(person);

        FileInputStream fis = new FileInputStream("Fields.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);
        System.out.println(oin.readObject());

        TaskLocalDates taskLocalDates = new TaskLocalDates();

        System.out.println(taskLocalDates.convertToLocalDate());
        System.out.println(taskLocalDates.convertToLocalTime());
        System.out.println(taskLocalDates.convertToLocalDateTime());


    }

}


