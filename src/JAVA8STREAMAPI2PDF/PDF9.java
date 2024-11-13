package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PDF9 {
    public static void main(String[] args) {
        List<Integer>Min_Max_Num= Arrays.asList(10,20,30,40,50,60,70,80,90,100,120,110);
        //find the maxnumbers by using the stream.
        Integer Maxnumbers=Min_Max_Num.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("Max_Numbers :"+Maxnumbers);//120

//  Find the min numbers by using the minnumbers
        Integer Minnumbers=Min_Max_Num.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("Min_Numbers :"+Minnumbers);//10

    }
}
