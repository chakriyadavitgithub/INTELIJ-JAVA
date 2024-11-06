package Java8Features;
//4.predefinedfunction

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PDFPREDICATE {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 20, 30, 40);
        Predicate<List> obj = numbers-> numbers.isEmpty();
        System.out.println(obj.test(al));//false
        ///b.Predicate by using the test
    }
}
