package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {14, 31, 11, 51, 12, 100};
        Integer[] arr1 = {14, 31, 11, 51, 12, 100};
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr1);
        System.out.println("Масив відсортовано від більшого до меншого - "+ Arrays.toString(arr));
        System.out.println("Масив відсортовано від меншого до більшого - "+ Arrays.toString(arr1));

    }


}
