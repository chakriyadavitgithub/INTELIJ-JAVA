package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Print Distinct values Lambda with Stream?
public class PDF26 {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(11,12,13,22,23,24,25,26,27,27,80,70);
        List<Integer>distinct_Numbers=numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct_Numbers);//[11, 12, 13, 22, 23, 24, 25, 26, 27, 80, 70]


    }
}
