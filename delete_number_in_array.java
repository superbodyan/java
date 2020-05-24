package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int main_arr[] = {1, 0, 3, 4, 6, 3, 3, 2, 1, 0, 3, 5, 6};
        System.out.println(Arrays.toString(Remove_Elements(main_arr, 0)));
    }
    
    /*
    * Функция удаления заданного числа из массива
    * @param MAIN_ARR - исходных массив
    * @param DELETE_VALUE - число, которе необходимо удалить
    * */
    private static int[] Remove_Elements(int[] MAIN_ARR, int DELETE_VALUE){
        int count_of_del_elements = 0;

        for (int i = 0; i < MAIN_ARR.length; i++){
            if (MAIN_ARR[i] == DELETE_VALUE){
                count_of_del_elements++;
            } else {
                MAIN_ARR[i - count_of_del_elements] = MAIN_ARR[i];
            }
        }
        return Arrays.copyOf(MAIN_ARR, MAIN_ARR.length - count_of_del_elements);
    }

}