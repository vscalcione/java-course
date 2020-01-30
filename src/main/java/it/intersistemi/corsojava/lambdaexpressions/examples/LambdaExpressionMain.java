package it.intersistemi.corsojava.lambdaexpressions.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaExpressionMain {

    public static void main(String[] args) {
        Random rndValue = new Random();
        int value = rndValue.nextInt();
        List<String> myList = Arrays.asList("item1", "item2", "item3", "item4", "item5");
        System.out.println("===== Example 1 (filter, sorting, print elements of list) === ");
        myList .stream()
                .filter(s -> s.startsWith("i"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<String> myList1 = Arrays.asList("value1", "value2", "value3", "value4");
        System.out.println("===== Example 2 (find and print the 1st element of list Collection type ==== ");
        myList1.stream()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("===== Example 3 (find and print the 1st of a list) ==== ");
        Stream.of("item1", "item2", "item3", "item4")
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("===== Example 4 (print element range of a list) ==== ");
        IntStream.range(1, 6)
                .forEach(System.out::println);
        System.out.println("\n");

        System.out.println("===== Example 5 (print random values list) ==== ");
        Arrays.stream(new int[] {rndValue.nextInt(5), rndValue.nextInt(3), rndValue.nextInt(15)})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);
    }
}
