package com.company;


import java.beans.Transient;
import java.io.Serializable;
import java.lang.annotation.Target;

@OutputFiles(runFiles = true)
public class Person implements Serializable {
    String name = "Nazar";
    transient int age = 19;


    @Override
    public String toString() {
        return "name = " + name + " " + "age = " + age;
    }
}
