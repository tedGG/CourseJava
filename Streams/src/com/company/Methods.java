package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;


public class Methods {
    public void serialize(Employee employee) throws IOException {

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Employee.txt"))) {

            objectOutputStream.writeObject(employee);

        }
    }

    public void deserialize() {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Employee.txt"))) {

            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void serializeList(List<Employee> employee){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("EmpList.txt"))) {

            objectOutputStream.writeObject(employee);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void deserializeList(){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("EmpList.txt"))) {

            LinkedList<Employee> employee= (LinkedList<Employee>) objectInputStream.readObject();
            System.out.println(employee);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


