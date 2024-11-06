package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
//by using Function and Predicate
public class PDFFUNCTION {
    public static void main(String[] args) {
        List<Integer>al= Arrays.asList(10,20,30,40);
        Predicate<List>obj1=nums->nums.isEmpty();
        Function<List ,Integer>obj2=nums->nums.size();

        System.out.println(obj1.test(al));//Predicate False
        System.out.println(obj2.apply(al));//Function 4
    }
}
