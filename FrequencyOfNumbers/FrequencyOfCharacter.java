
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {

    
    public static void main(String[] args) {
        
        String name = "satish";
        
        Map<Character, Long> collect = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(collect);
    }
    
}
