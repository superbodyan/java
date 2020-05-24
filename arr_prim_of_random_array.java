package com.company;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count_of_elements = 10;
        int[] arr_numbers = new int[count_of_elements];
        int MIN_ARR_NUMBER = 2;
        int MAX_ARR_NUMBER = 100;

        // заполнение массива случайными числами с помощью функции Generate_Random_Number и вывод простых чисел с помощью фугкции Find_Simple_Numbers
        for (int i = 0; i < arr_numbers.length; i++){
            arr_numbers[i] = Generate_Random_Number(MIN_ARR_NUMBER, MAX_ARR_NUMBER);
            if (Find_Simple_Numbers(arr_numbers[i])){
                System.out.println(arr_numbers[i]);
            }
        }
        
    }

    /*Функция для генерирования случайных чисел в заданном диапазоне
    * @param MIN_RANDOM_NUMBER - минимально значение для генерироции
    * @param MAX_RANDOM_NUMBER - максимальное значение для генерации
     */
    private static int Generate_Random_Number(int MIN_RANDOM_NUMBER, int MAX_RANDOM_NUMBER){
        MAX_RANDOM_NUMBER -= MIN_RANDOM_NUMBER;

        return (int) (Math.random() * ++MAX_RANDOM_NUMBER) + MIN_RANDOM_NUMBER;
    }
    
    /*
    * Функция проверки числа на простоту
    * @param NUMBER_TO_CHECK - число из массива для проверки
     */

    private static boolean Find_Simple_Numbers(int NUMBER_TO_CHECK){
        for (int i = 2; i <= NUMBER_TO_CHECK/2; i++){
            int temp = NUMBER_TO_CHECK % i;
            if (temp == 0){
                return false;
            }
        }
        return true;
    }


}