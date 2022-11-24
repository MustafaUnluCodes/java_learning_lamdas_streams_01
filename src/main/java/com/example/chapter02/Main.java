package com.example.chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Integer[] scores = new Integer[] {80, 66, 73, 92, 43};

        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        // There are 2 ways to create streams

        // Way I: Create strean from existing array or collection

        Stream<Integer> scoresStream = Arrays.stream(scores);

        // Stream<String> shoppingListStream = shoppingList.stream();

        // Way II: Create strean NOT from existing array or collection

        Stream<String> streamLetters = Stream.of("a", "b", "e", "w", "z");




        // Operations

/*
        shoppingListStream
                .sorted()
                .forEach((item -> System.out.println(item)));

                */


/*
        shoppingListStream
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .forEach((item -> System.out.println(item)));


 */

        // shoppingListStream.forEach(item -> System.out.println(item));


/*
        shoppingList
                .stream()
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .forEach((item -> System.out.println(item)));


        System.out.println(shoppingList);


 */

        List<String> sortedShoppingList = shoppingList
                .stream()
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .collect(Collectors.toList());

        sortedShoppingList.forEach(item -> System.out.println(item));

        System.out.println(shoppingList);





    }
}
