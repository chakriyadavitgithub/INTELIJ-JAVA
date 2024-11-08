package JAVA8FEATURES4STREAMAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
///and this is normal method with out string
public class SteamApiTwo {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13);
        List<Integer>even_nums=new ArrayList<Integer>();
        List<Integer>odd_nums=new ArrayList<Integer>();

        for (Integer num:numbers) {
            if (num % 2 == 0) {
                even_nums.add(num);
            } else {
                odd_nums.add(num);
            }
        }
        System.out.println(numbers);
        System.out.println(even_nums);
        System.out.println(odd_nums);
    }
}
