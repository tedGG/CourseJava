package com.company;



public class Deputy extends Human{
    String Lastname;
    String name;
    int age;
    boolean bribe_taker;
    int bribesize;
    String fraction;


    public Deputy(String lastname, String name, int age, boolean bribe_taker, int bribesize,String fraction) {
        this.fraction = fraction;
        this.Lastname = lastname;
        this.name = name;
        this.age = age;
        this.bribe_taker = bribe_taker;
        this.bribesize = bribesize;
    }




    public void givebribe(){

        if(bribe_taker){
        System.out.println("the police will imprison the deputy");
        }
        else if(bribesize<5000){
            System.out.println("Bribe: " + getBribesize());
            System.out.println("the police will imprison the deputy");
        }else
            System.out.println("this deputy is not take bribes");
    }

    @Override
    public String toString() {
        return  String.format(name + " "+ Lastname + " " + age + " " + bribe_taker + " " + bribesize + " " + fraction);
    }


    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribe_taker() {
        return bribe_taker;
    }

    public void setBribe_taker(boolean bribe_taker) {
        this.bribe_taker = bribe_taker;
    }

    public int getBribesize() {
        return bribesize;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    public void setBribesize(int bribesize) {
        this.bribesize = bribesize;
    }


}
