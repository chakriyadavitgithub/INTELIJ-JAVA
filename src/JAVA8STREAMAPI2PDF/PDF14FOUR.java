package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//with lambda & with Stream
public class PDF14FOUR {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(100,300,200,500,600,400);
        //by using the stream
        List<Integer>List_num=numbers.stream()
                //by using the lambda
                .sorted((a,b)-> a.compareTo(b))
                .collect(Collectors.toList());
        System.out.println(List_num);//[100, 200, 300, 400, 500, 600]

    }
}
