package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PDFCONSUMERARRAYS {
    public static void main(String[] args) {
        //by using the consumer with arrays
        //and by using the for each method
        //and we are using the list also
        //consumer has only one method (accept)
   List<Integer>numbers= Arrays.asList(10,20,40,60,70);
        Consumer<List>C=(nums)->{
            for (Object number:nums){
                System.out.println(number);
            }
        };
        C.accept(numbers);

    }
}
