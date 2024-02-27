/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysorter;

import java.util.Arrays;

/**
 *
 * @author Гамаюнов Иван
 */
// Пример использования класса ArraySorter.
public class Main {
    public static void main(String[] args) {
        Integer[] array = {5, 3, 1, 2, 4};

        // Сортировка массива с помощью пузырьковой сортировки.
        ArraySorter.bubbleSort(array);
        System.out.println("Пузырьковая сортировка: " + Arrays.toString(array)); // [1, 2, 3, 4, 5]

        // Сортировка массива с помощью сортировки выбором.
        ArraySorter.selectionSort(array);
        System.out.println("Сортировка выбором: " + Arrays.toString(array)); // [1, 2, 3, 4, 5]

        // Сортировка массива с помощью сортировки вставками.
        ArraySorter.insertionSort(array);
        System.out.println("Сортировка вставками: " + Arrays.toString(array)); // [1, 2, 3, 4, 5]

        // Сортировка массива с помощью быстрой сортировки.
        ArraySorter.quickSort(array, 0, array.length - 1);
        System.out.println("Быстрая сортировка: " + Arrays.toString(array)); // [1, 2, 3, 4, 5]

        // Сортировка массива с помощью сортировки слиянием.
        ArraySorter.mergeSort(array);
        System.out.println("Сортировка слиянием: " + Arrays.toString(array)); // [1, 2, 3, 4, 5]
    }
}

