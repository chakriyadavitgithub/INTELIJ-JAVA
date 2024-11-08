package JAVA8FEATURES4STREAMAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiThree {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13);
//here by using the with string
        //and by using the filter & collector
        List<Integer>odd_Numbers=numbers.stream()
                //.filter(num->num%2 ==0)//[2, 4, 6, 8, 10, 12]& this is for evennumbers
                .filter(num->num%2 !=0)//[1, 3, 5, 7, 9, 13]
                .collect(Collectors.toList());
        System.out.println(odd_Numbers);

//by using the for each & lambdaexpression and o/p wil be come all numbers
        numbers.stream().forEach(number-> System.out.println(number));


        //here by using the only for each method and the ouput will be same
        numbers.stream().forEach(System.out::println);
    }
}
