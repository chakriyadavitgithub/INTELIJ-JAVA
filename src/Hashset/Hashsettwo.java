package Hashsettwo;
import java.util.HashSet;

public class Hashsettwo {
    public static void main(String[] args) {
        HashSet<Integer> s1=new HashSet<Integer>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);//dupliactes are not allowed
        //System.out.println(s1);//[1, 2, 3, 4]

        HashSet<Integer> s2=new HashSet<Integer>();
        s2.add(3);//duplicates are not allowed
        s2.add(4);
        s2.add(5);
        s2.add(6);
        //set operations

        //union operations
        //s1.addAll(s2);
        //System.out.println(s1);//[1, 2, 3, 4, 5, 6]

        //interaction operator
        // s1.retainAll(s2);
        //System.out.println(s1);//[3,4]

        //by using the contains all
        //s1.containsAll(s2);
        //System.out.println(s1);//[1,2,3,4]

        //by using the remove all
        s1.removeAll(s2);
        System.out.println(s1);//[1,2]

    }
}
