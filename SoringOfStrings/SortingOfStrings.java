package SoringOfStrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOfStrings{
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Satish", "Manish", "Diksha", "Shikha", "Kunal", "Rahul");
        List<String> ascendingOrder = names.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingOrder);

        List<String> descendingOrder = names.stream().sorted((s1,s2)-> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(descendingOrder);
    }
    
}