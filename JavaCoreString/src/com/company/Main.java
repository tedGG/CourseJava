package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        PalindromWord();
        SwitchDash();
        CountWordOnTheSentence();
        WordInTheSentence();
        WordOften();
        CountWordinTheSentence();



    }
    public static void PalindromWord(){
        Scanner scanner =  new Scanner(System.in);
        String enterpalindrom = scanner.nextLine();


        if(enterpalindrom.length()==5 || enterpalindrom.length()==3){
            StringBuilder stringBuilder = new StringBuilder(enterpalindrom);
            StringBuilder finishResult = stringBuilder.reverse();
            if(enterpalindrom.equalsIgnoreCase(finishResult.toString())){
                System.out.println("Слово є паліндромом");
            }
        }else System.out.println("Слово не являється паліндромом");
    }
    public static void SwitchDash(){
        String testString = "Слово не горобець, вилетить не спіймаєш";
        System.out.println(testString.replaceAll("[аеоуиі]", " "));
    }
    public static void CountWordOnTheSentence() {
        Scanner scanner =  new Scanner(System.in);
        String input = scanner.nextLine();

        int counter = 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                counter++;
            }

        }
        System.out.println("Було введено " + counter + " слова");
    }
    public static void WordInTheSentence(){
        Scanner scanner =  new Scanner(System.in);
        String input = scanner.nextLine();
        int counter= 0;
        for(int i =0; i < input.length();i++){
            if(input.charAt(i)=='.'){
                counter++;
            }
        }
        System.out.println("Було введено " + counter + " речень");

    }
    public static void WordOften(){
        Scanner scanner =  new Scanner(System.in);
        String input = scanner.nextLine();

        for(int i = 0; i < input.length();i++){
            if(input.contains("Програмист")){
                System.out.println();

            }
        }
    }
    public static void CountWordinTheSentence(){
        String value = "This is testing Program testing Program";

        String item[] = value.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : item) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        System.out.println("Слова, які найчастіше зустрічаються в тексті або реченні: ");
        for (String key : keys) {
            if(map.get(key)>1){
                System.out.println(key);
            }

        }
    }
}