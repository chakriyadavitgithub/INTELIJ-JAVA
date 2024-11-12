package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PDF6 {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(200,30,267,250,50,40);
        System.out.println(numbers);
        Stream<Integer>numbers1=numbers.stream();

        Stream<Integer>numbers2=Stream.of(200,30,267,250,50,40);
        System.out.println(numbers1);
        System.out.println(numbers2);
        numbers.forEach(System.out::println);
    }
}
