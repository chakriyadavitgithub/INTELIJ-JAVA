package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//08)Print Duplicate Numbers using Streams?
public class PDF8 {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,62,3,4,5,1,8,3,9);
        System.out.println(numbers);
        Set<Integer>duplicates_Num=PDF8 (numbers);
        duplicates_Num.forEach(System.out::println);
    }
    public static <T>Set<T>PDF8(List<T>list){
        Set<T> items=new HashSet<>();
        return list.stream()
                .filter((n->!items.add(n)))
                .collect(Collectors.toSet());//o/p:1,3,4.5 here duplicate values are repeated

    }


}
