package Java8Features;
//inbuilt interface
import java.util.function.Function;

public class PDF2 {
    public static void main(String[] args) {
        //by using the lambda expression & using the length
        Function<String,Integer>obj=ename->ename.length();
             //  (T-input ,R-return)
        System.out.println(obj.apply("Chakri"));//6
        System.out.println(obj.apply("Nancy.."));//7
    }
}
