package Java8Features;

import java.util.Random;
import java.util.function.Supplier;

public class PDFSUPPLIERRANDOM {
    public static void main(String[] args) {
        Random r=new Random();//with supplier by using the random
        Supplier<Integer>s=()->500;
        System.out.println(s.get());

    }
}
