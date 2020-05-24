package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count_of_elements = 100;
        double[] arr_numbers = new double[count_of_elements];
        // заполнение массива случайными числами с помощью Math.random()
        for (int i = 0; i < arr_numbers.length; i++){
            arr_numbers[i] = Math.random();
        }

        double MAX_ELEMENT = arr_numbers[0];
        double MIN_ELEMENT = arr_numbers[0];
        double AVG_ELEMENT = 0;
        // Нахождение Максимального, Минимального и среднего значения массива arr_numbers
        for (int i = 0; i < arr_numbers.length; i++){
            if (MAX_ELEMENT < arr_numbers[i]){
                MAX_ELEMENT = arr_numbers[i];
            }
            if (MIN_ELEMENT > arr_numbers[i]){
                MIN_ELEMENT = arr_numbers[i];
            }
            AVG_ELEMENT += arr_numbers[i]/arr_numbers.length;
        }
        System.out.print("MAX = " + MAX_ELEMENT + " " + "MIN = " + MIN_ELEMENT + " " + "AVG = " + AVG_ELEMENT);

    }



}