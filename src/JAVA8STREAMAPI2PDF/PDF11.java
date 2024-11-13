package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.List;

//11)Get/ignore the first 5 numbers using Limit and Print Sum?
public class PDF11 {
    public static void main(String[] args) {
        List<Integer>Skip_Numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum=Skip_Numbers.stream()
                .skip(5)//here skip the first 5 values by using the skip
                .mapToInt(Integer::intValue)//and sum remaining the values
                .sum();
        System.out.println("First 5 numbers are skip & remaining values will be sum :"+sum);
    }
}
