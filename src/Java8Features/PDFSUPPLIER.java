package Java8Features;

import java.util.function.Supplier;
//d)supplier
//IN PDF supplier by using the get method
//and this supplier only<return>only
public class PDFSUPPLIER {
    public static void main(String[] args) {
        Supplier<String>s=()->"Hello";
        System.out.println(s.get());//hello

        Supplier<Integer> s1=()->200;
        System.out.println(s1.get());//200
    }
}
