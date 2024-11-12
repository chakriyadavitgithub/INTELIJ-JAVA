package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.List;

public class PDF4 {
    public static void main(String[] args) {
//        List<Integer>even_numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        System.out.println("even numbers:");
//        even_numbers.stream()
//                .filter(num-> num %2 ==0)
//                .forEach(System.out::println);


        List<Integer>odd_numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("odd numbers:");
        odd_numbers.stream()
                .filter(num->num%2!=0)
                .forEach(System.out::println);

    }
}
