package Streams;


import java.util.*;
import java.util.stream.Collectors;

public class Streams_with_List_Set {
    /**
     * ---------------Streams-------------
     * Stream API is a new feature available from Java 8
     * Using streams done aggregate operations on data returned from collections
     * classes.
     * The aggregate operation does not change the data structure itself.
     * ArrayLIst and Array etc not changed itself.
     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(new String[]{"Anar", "Samir", "Xezer", "Azeri"}));

        // Find count of String in the list starting with A
        Long count = names.stream().filter(n -> n.startsWith("A")).count(); //2

        // Print all names which length is greater than 4
        names.stream().filter(n -> n.length() > 4).forEach(n -> System.out.print(n + " ")); //Samir, Xezer , Azeri

        // Print only first 2 name which length is greater than 4
        names.stream().filter(n -> n.length() > 4).limit(2).forEach(n -> System.out.print(n + " "));//Samir Xezer

        // Mapping - Convert the names to uppercase which begins with "A";
        names.stream().filter(n -> n.startsWith("A")).map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));//ANAR , AZERI

        // Sort the names and show in UpperCase using streams
        names.stream().sorted().map(n -> n.toUpperCase()).forEach(n -> System.out.print(n + " "));//ANAR AZERI SAMIR XEZER

        // Sort , unique values and store in new List
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 4, 2, 3, 7, 3, 9, 8, 9);
        List<Integer> sortedUnique = num.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedUnique);
    }
}
