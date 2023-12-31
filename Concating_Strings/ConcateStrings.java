package Concating_Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcateStrings{

    public static void main(String[] args) {
        List<String> names = Arrays.asList("satish", "manish", "Kunal");
        String concatedStrings = names.stream().collect(Collectors.joining());
        System.out.println(concatedStrings);
    }

}