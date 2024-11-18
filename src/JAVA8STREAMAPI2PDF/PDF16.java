package JAVA8STREAMAPI2PDF;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class PDF16 {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Orange");
        //by using the foreach and by using the lambdaexpression
        //  // Using forEach to iterate over the Map and print its entries
        map.forEach((key,value)->value.toUpperCase());

        //// Using replaceAll to convert all values to uppercase
        map.replaceAll((key,value)->value.toUpperCase());

        //// Printing the modified Map
        map.forEach((key,value)-> System.out.println(key+"->"+value));




    }
}

//public class LambdaWithMap {
//    public static void main(String[] args) {
//        // Creating a Map with some initial values
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(3, "Three");
//
//        // Using forEach to iterate over the Map and print its entries
//        map.forEach((key, value) -> System.out.println(key + " -> " + value));
//
//        // Using replaceAll to convert all values to uppercase
//        map.replaceAll((key, value) -> value.toUpperCase());
//
//        // Printing the modified Map
//        map.forEach((key, value) -> System.out.println(key + " -> " + value));
//    }
//}
