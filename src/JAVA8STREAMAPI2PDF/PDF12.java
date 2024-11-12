package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Get Second Highest/Lowest Number using Streams?
public class PDF12 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,12,22,34,33,44,55,66);
        int sec_low =numbers.stream()
                .sorted()
                .skip(1) //with skip o/p:12
                .findFirst()
                .get();//with finfset & get o/p:10
        System.out.println(numbers);
        System.out.println(sec_low);
    }
}
