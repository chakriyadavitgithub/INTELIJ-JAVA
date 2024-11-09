package JAVA8FEATURES4STREAMAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//by using the streamAPI
public class StreamApiFive {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Harsha", "king", "pooja", "pushpa", "priya",
                "prakash", "RRR", "Salaar", "nancy", "sunny","Honey", "bunny");
        List<String>new_enames=enames.stream()
                .filter(ename->ename.startsWith("H"))//by using the startswith
                .collect(Collectors.toList());//and collectors of list
        System.out.println(enames);
        System.out.println(new_enames);//[Harsha, Honey]
    }
}
