package com.company;

public class employee implements Salary {
    String name;
    int hour;
    int salaryPerHour;


    public employee(String name, int hour, int salaryPerHour) {
        this.name = name;
        this.hour = hour;
        this.salaryPerHour = salaryPerHour;
    }

    public int getHour() {
        return hour;
    }


    public String getName() {
        return name;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }




    @Override
    public void employeesSalary() {
        int result = getSalaryPerHour() * getHour()*21;
        System.out.println("Працівник, який заробляє погодинно отримує місячну зарплату в розмірі: "+result +" тисячі");

    }
}
