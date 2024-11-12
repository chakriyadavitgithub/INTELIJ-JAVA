package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.List;
//Q)6
public class PDF06 {
    public static void main(String[] args) {
        //Lambda for Creating a Stream? Stream.of() method?
        List<Integer>numbers= Arrays.asList(88,10,20,23,24,35,26,34,55,66);
        numbers.stream()
                .forEach(System.out::println);
    }
}

