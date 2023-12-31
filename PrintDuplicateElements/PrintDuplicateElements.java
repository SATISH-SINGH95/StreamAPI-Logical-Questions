import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateElements {

    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(1,2,3,1,2,6,2,7,2);
        
        // print only those elements which are repeating
        Set<Integer> collect = n.stream().filter(x ->n.stream().filter(a-> a==x).count()>1).collect(Collectors.toSet());
        System.out.println(collect);
    }
    
}
