package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e1 = new Employee("Nazar",1,15000);
        Employee e2 = new Employee("Oles",2,14000);

        Methods methods = new Methods();

        methods.serialize(e1);
        methods.deserialize();

        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(e1);
        employeeList.add(e2);

        methods.serializeList(employeeList);
        methods.deserializeList();







    }
}
