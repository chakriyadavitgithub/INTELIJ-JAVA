package JAVA8STREAMAPI2PDF;
import java.util.Arrays;
import java.util.List;
//07)Print names - (String) Starts With Prefix “R” using Stream
public class PDF7 {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("Raju","Ramu","Sam","Ammu","Rajesh","Rosie");
        names.stream()
                .filter(name->name.startsWith("R"))//filters the stream to include only names that start with “R”.
                .forEach(System.out::println);//prints each name that passes the filter.
    }
}
