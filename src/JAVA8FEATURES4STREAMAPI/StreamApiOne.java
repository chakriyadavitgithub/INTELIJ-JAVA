package JAVA8FEATURES4STREAMAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOne {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("chakri","sai","naresh","priya");
        //by using the stream & getting the uppercase
        //by the list using and creating the object by using the string values
        List<String> new_Employees=enames.stream()
                .map(ename-> ename.toUpperCase())//by using the map needs function with lambda expression
                .collect(Collectors.toList());//and collections need by using the tolist
        System.out.println(new_Employees);
        System.out.println(enames);

    }
}
