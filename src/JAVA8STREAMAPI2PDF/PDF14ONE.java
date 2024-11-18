package JAVA8STREAMAPI2PDF;

import java.util.*;
//14)Sorting a list with/out lambda and with/out stream?
//without lambda and without stream

public class PDF14ONE {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 5, 3, 6, 9, 4, 7, 8, 1);
        Collections.sort(number, new Comparator<Integer>() {
            public  int compare(Integer a,Integer b){
                return a.compareTo(b);
            }
        });
        System.out.println(number);//[1, 3, 4, 5, 6, 7, 8, 9, 10]
    }

}
