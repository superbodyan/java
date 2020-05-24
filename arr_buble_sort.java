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
            System.out.println(arr_numbers[i]);
        }

        //Пузырьковая сортировка

        for (int i = 0; i < arr_numbers.length; i++){
            for (int j = 0; j < arr_numbers.length - 1; j++){
                if (arr_numbers[j] > arr_numbers[j + 1]){
                    double temp = arr_numbers[j + 1];
                    arr_numbers[j + 1] = arr_numbers[j];
                    arr_numbers[j] = temp;
                }
            }
        }
        System.out.println("SORTED: ");
        for (int i = 0; i < arr_numbers.length; i++){
            System.out.println(arr_numbers[i]);
        }

    }



}