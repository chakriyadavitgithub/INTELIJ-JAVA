package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.List;
//pdf Q)1
//With Stream
public class PDF01 {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(200,30,267,250,50,40);
        int sum=numbers.stream()
                .reduce((a,b)->a+b)
                .get();
        System.out.println(sum);//837
    }
}
