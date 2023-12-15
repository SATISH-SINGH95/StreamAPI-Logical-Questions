package SumOfNumbers;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers{
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        Integer sum = numbers.stream().reduce((a,b)-> a+b).get();
        System.out.println(sum);

    }
}