package com.company;

public class employee2FixSalary implements Salary{
    String nameFix;
    int salaryPerHour;
    int fixSalary;
    int hour;
    int days;


    public employee2FixSalary(String nameFix, int salaryPerHour, int fixSalary, int hour,int days) {
        this.nameFix = nameFix;
        this.salaryPerHour = salaryPerHour;
        this.fixSalary = fixSalary;
        this.hour = hour;
        this.days =days;
    }

    public int getFixSalary() {
        return fixSalary;
    }



    public int getDays() {
        return days;
    }

    @Override
    public void employeesSalary() {
            int res = getFixSalary()/21 * getDays() ;

            System.out.println("Працівник з фіксованою запрлатою отримує в місяць: "+res +" тисячі");
    }
}
