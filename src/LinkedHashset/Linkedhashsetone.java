package LinkedHashset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkedhashsetone {
    public static void main(String[] args) {
      ArrayList<String>enames1 = new ArrayList<String>();
      LinkedHashSet<String> enames2 = new LinkedHashSet<String>();
      LinkedList<String> enames3=new LinkedList<String>();
       HashSet<String> enames4 =new HashSet<String>();

        enames2.add("Siri");
        enames2.add("Nancy");
        enames2.add("Ola");
        enames2.add("Siri");//duplicate values are not allowed
        enames2.add("Priya");
        enames2.add((null));//null values are aloowed for once
        System.out.println(enames2.size());//5
        System.out.println(enames2.isEmpty());//false
        System.out.println(enames2.contains("Siri"));//true
       // System.out.println(enames2);//[Siri, Nancy, Ola, Priya] maintaied order
    }
}
