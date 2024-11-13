package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PDF13ONE {
    //1. Filtering with Lambda Expression and Stream
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>even_Numbers=numbers.stream()
                //filrets even_num are using the Lambda & stream
                .filter(num->num %2==0)
                .collect(Collectors.toList());
        System.out.println("Even_Num :"+even_Numbers);//Even_Num :[2, 4, 6, 8, 10]
    }

}
