package JAVA8STREAMAPI2PDF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Without Lambda and Stream
public class PDF13THREE {
    public static void main(String[] args) {
        List<String>WTO_Names= Arrays.asList("nancy","nandu","noise","babe","Kushi");
        List<String>Filtered_Names=new ArrayList<String>();
        for (String name:WTO_Names){
            if (name.startsWith("n")){
                Filtered_Names.add(name);
            }
        }
        System.out.println("with out lambda & stream :"+Filtered_Names);
    }
}
