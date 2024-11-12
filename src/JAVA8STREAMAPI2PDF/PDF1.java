package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.List;

//pdf Q)1
//with out stream
public class PDF1 {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(200,30,267,250,50,40);
        int sum=0;
        for (Integer num:numbers){
            sum =sum+num;
        }
        System.out.println(sum);
    }
}
