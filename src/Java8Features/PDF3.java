package Java8Features;
import java.util.Arrays;
import  java.util.List;
interface ptwo{
    public abstract  boolean test(List Numbers);
}
public class PDF3 {//with static
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(10,20,30,40);
        ptwo obj=Numbers -> Numbers.isEmpty();//by using the lambda expression
        System.out.println(obj.test(al));//false

    }
}
