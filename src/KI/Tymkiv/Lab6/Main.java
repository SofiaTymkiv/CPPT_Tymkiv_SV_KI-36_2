package KI.Tymkiv.Lab6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 10, 3, 7, 1);

        Jar<Integer> integerJar = new Jar<>(integerList);
        System.out.println("Integer Jar:");
        System.out.println("Min: " + integerJar.findMin());
        System.out.println("Max: " + integerJar.findMax());
        System.out.println("Random: " + integerJar.getRandom());
        System.out.println("Sorted: " + integerJar.sorted());
        System.out.println("integerJar: " + integerJar);
        List<String> stringList = Arrays.asList("apple", "orange", "banana", "grape", "kiwi");

        Jar<String> stringJar = new Jar<>(stringList);
        System.out.println("\nString Jar:");
        System.out.println("Min: " + stringJar.findMin());
        System.out.println("Max: " + stringJar.findMax());
        System.out.println("Random: " + stringJar.getRandom());
        System.out.println("Sorted: " + stringJar.sorted());
        System.out.println("stringJar: " + integerJar);
    }
}