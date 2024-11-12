package JAVA8STREAMAPI2PDF;
//02)Square, Filter and Average of Numbers?
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PDF2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,300);
       // List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        OptionalDouble average = numbers.stream()//
                .map(num -> num * num)//square the numbers
                .filter(n -> n > 100)//filter the numbers greater
                .mapToInt(n -> n)//map into int
                .average();//calculate the average
        if (average.isPresent()) {
            System.out.println("Average:" + average.getAsDouble());//Average:15142.5
        }else {
            System.out.println("no numbers match the upper ");//no numbers match the upper numbers
        }
    }
}
