package com.questions1_50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {
    public static void main(String[] args) {
        // Integer array
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Stream operation to filter odd numbers and collect them into a List
        List<Integer> oddNumbers = Arrays.stream(numbers)
                                         .filter(n -> n % 2 != 0)  // Filter for odd numbers
                                         .collect(Collectors.toList());  // Collect as List

        // Convert List back to an array if needed
        Integer[] oddNumbersArray = oddNumbers.toArray(new Integer[0]);

        // Print the odd number array
        System.out.println(Arrays.toString(oddNumbersArray));
    }
}

