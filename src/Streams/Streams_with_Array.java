package Streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams_with_Array {


    public static void main(String[] args) {
        Integer[] num = {4, 7, 8, 13, 5, 16, 7, 8, 56, 4, 3, 4};

        // Find count of even digits in array
        Long even = Arrays.stream(num).filter(n -> n % 2 == 0).count();

        // Print all even numbers
        Arrays.stream(num).sequential().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n)); // 4, 8, 16

        // Print first 2 odd digits
        Arrays.stream(num).sequential().filter(n -> n % 2 != 0).limit(2).forEach(n -> System.out.println(n));//7,13

        // Print unique numbers
        Arrays.stream(num).sequential().distinct().forEach(n-> System.out.print(n+" "));

        // Sort unique values and store in new List
        List<Integer> uniqueList =Arrays.stream(num).sequential().distinct().sorted().collect(Collectors.toList());
    }
}
