package Frequency;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {

    
    public static void main(String[] args) {
        
        String name = "satish ,singh";
        
        // space(' ') and comma(',') is counted in this
        Map<Character, Long> collect = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(collect);

        // space(' ') and comma(',') is not counted in this
        Map<Character, Long> collect1 = name.chars().mapToObj(c->(char)c).filter(c-> c!=' ' && c!=',').collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(collect1);
        
    }
    
}
