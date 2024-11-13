package JAVA8STREAMAPI2PDF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Using Lambda without Stream
public class PDF13TWO {
    public static void main(String[] args) {
        List<String>Names= Arrays.asList("Charile","Hari","Moni","Chotu");
        List<String>Filternmaes=new ArrayList<String>();
        Names.forEach(name->{
            if (name.startsWith("C")){
                Filternmaes.add(name);
            }
        });
        System.out.println("Using lambda WithoutStream :" +Filternmaes);//Using lambda WithoutStream :[Charile, Chotu]

    }
}
