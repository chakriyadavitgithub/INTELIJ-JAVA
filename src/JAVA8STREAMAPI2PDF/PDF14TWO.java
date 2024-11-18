package JAVA8STREAMAPI2PDF;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//with lambda & without stream
public class PDF14TWO {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(10, 5, 3, 6, 9, 4, 7, 8, 2);
        //here using the lambda expression
        //& stream are not using
        Collections.sort(numbers,(a,b)->a.compareTo(b));
        System.out.println(numbers);//[2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}
