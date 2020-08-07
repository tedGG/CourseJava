package com.company.Interfaces2;

import com.company.Interfaces.Numarable;

public class Mycalculator implements Numarable {
    int k = 30;
    int j = 25;
    @Override
    public void devide() {
        int result = k /j;
        System.out.println("Поділити - "+result);
    }

    @Override
    public void minus() {
        int result = k - j;
        System.out.println("Відняти - "+result);
    }

    @Override
    public void multiple() {
        int result = k *j;
        System.out.println("Помножити - "+result);
    }

    @Override
    public void add() {
        int result = k + j;
        System.out.println("Додати - "+result);
    }
}
