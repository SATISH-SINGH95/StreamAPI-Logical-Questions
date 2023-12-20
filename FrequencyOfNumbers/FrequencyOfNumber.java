import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FrequencyOfNumber{

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,4,2,6,2,1,7,4,6,2,9,4,1,6,8,1);

        // using pre defined method of stream api
        Map<Integer, Long> frequency = numbers.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(frequency);

    }

}