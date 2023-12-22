package AveragOfNumbers;

import java.util.Arrays;
import java.util.List;

public class AveragOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        Double average = numbers.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println(average);

        // -------------- OR ---------------------

        double avg = numbers.stream().mapToDouble(n-> Double.valueOf(n)).average().getAsDouble();
        System.out.println(avg);
    }
    
}
