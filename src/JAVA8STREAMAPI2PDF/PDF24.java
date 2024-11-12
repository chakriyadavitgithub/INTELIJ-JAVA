package JAVA8STREAMAPI2PDF;

import java.util.*;
import java.util.stream.Collectors;

//IN PDF Q)24
//lambda with sorting
//with out stream & with stream
public class PDF24 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(20,30,22,23,24,33,25,26,36);
        System.out.println(numbers);//[20, 30, 22, 23, 24, 33, 25, 26, 36]
        ////with out stream
//        Collections.sort(numbers);
//        System.out.println(numbers);//[20, 22, 23, 24, 25, 26, 30, 33, 36]

        //with stream
        List<Integer>sorted_List_Numbers=numbers.stream()
               // .sorted(Comparator.reverseOrder())//[36, 33, 30, 26, 25, 24, 23, 22, 20]
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted_List_Numbers);//[20, 22, 23, 24, 25, 26, 30, 33, 36]


    }
}
