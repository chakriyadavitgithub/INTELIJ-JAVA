package Java8Features;
//4.predefined function
import java.util.function.Function;
public class predefinedfunction{
    public static void main(String[] args) {
        Function<Integer,Integer> obj=num -> num*num;
        //here applying the (apply)
        System.out.println(obj.apply(10));//100
    }
}

