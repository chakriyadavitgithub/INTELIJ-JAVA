package JAVA8FEATURES4STREAMAPI;

import java.util.Arrays;
import java.util.List;

public class StreamApiCount {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Harsha", "king", "pooja", "pushpa", "priya",
                "prakash", "RRR", "Salaar", "nancy", "sunny","Honey", "bunny");
        long no_of_emp=enames.stream()
                .filter(ename->ename.startsWith("p"))
                .count();//bynusing the count and with stream
        //we can use this count in stream only
        System.out.println(no_of_emp);//4
    }
}
