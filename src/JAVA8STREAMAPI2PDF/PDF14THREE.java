package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//With outlambda & Stream
public class PDF14THREE {
    public static void main(String[] args) {
        //here the numbers will be unordered by using the stream and sort
        //and it will be give the result
        List<Integer> numbers = Arrays.asList(10, 40, 50, 20, 90, 30);
        //by using the stream & sorted
        List<Integer> sortedlist = (List<Integer>) numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedlist);//[10, 20, 30, 40, 50, 90]
    }
}
