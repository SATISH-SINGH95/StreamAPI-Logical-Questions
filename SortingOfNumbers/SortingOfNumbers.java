package SortingOfNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,2,6,3,44,90,34);

        List<Integer> ascendingOrder = numbers.stream().sorted().collect(Collectors.toList()); // will be sorted in ascending order/natural sorting order
        System.out.println(ascendingOrder);

        List<Integer> descendingOrder = numbers.stream().sorted((n1, n2)-> n2-n1).collect(Collectors.toList());
        System.out.println(descendingOrder);
    }
    
}
