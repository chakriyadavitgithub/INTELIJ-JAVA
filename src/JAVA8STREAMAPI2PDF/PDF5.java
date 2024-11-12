package JAVA8STREAMAPI2PDF;
//IN PDF Q)5
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//05)Print Numbers Starts With Prefix 3 using?
public class PDF5 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(12,34,14,22,33,23,24,25,66,77,88,99);
        List<String>  new_number=numbers.stream()
                .map(num->String.valueOf(num))
                .filter(num->num.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(new_number);//[22, 23, 24, 25]
    }
}
