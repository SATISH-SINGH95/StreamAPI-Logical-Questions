import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Numbers{
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(9,3,2,6,3,8,9,6,22,2,123,234,54,220);

        // square of numbers
        List<Integer> squareOfNumbers = n.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println(squareOfNumbers);

        // square of numbers and get only those numbers which are greater than 7
        List<Integer> greaterThanSeven = n.stream().map(x-> x*x).filter(e-> e>7).collect(Collectors.toList());
        System.out.println(greaterThanSeven);

        // print those number which starts with 2
        List<Integer> startsWithTwo = n.stream().map(x->String.valueOf(x)).filter(e->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(startsWithTwo);

        // print duplicate elements
        Set<Integer> duplicates = n.stream().filter(e-> Collections.frequency(n,e)>1).collect(Collectors.toSet());
        System.out.println(duplicates);

        // print sum of first five numbers
        Integer sumOfFirstFive = n.stream().limit(5).reduce((a,b)-> a+b).get();
        System.out.println(sumOfFirstFive);

        // skip first 5 numbers and do sum of all remaining
        Integer sum = n.stream().skip(5).reduce((a,b)-> a+b).get();
        System.out.println(sum);

        // find frequency of each element
        Map<Integer, Long> frequency = n.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);

        // print third highest element
        Integer thirdHIghest = n.stream().sorted(Comparator.reverseOrder()).skip(2).findAny().get();
        System.out.println(thirdHIghest);

        //------or------
        Integer integer = n.stream().sorted((a,b)-> b-a).skip(2).findAny().get();
        System.out.println(integer);
        
        // print descending order of given list of numbers
        List<Integer> descendingOrder = n.stream().sorted((a,b)-> b-a).collect(Collectors.toList());
        System.out.println(descendingOrder);

        // print ascending order of given list of numbers
        List<Integer> ascendingOrder = n.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingOrder);
        
    }
}