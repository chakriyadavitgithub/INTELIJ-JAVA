package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
public class Arraylisttwo {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nancy");
        enames.add("Priya");
        enames.add("Bobby");
        enames.add("RRR");
        //by using the ilterator
        //iterator arraylist-using for,do while and do while & for each
        Iterator itr= enames.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
