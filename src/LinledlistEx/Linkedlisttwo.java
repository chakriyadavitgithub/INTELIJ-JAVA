package LinledlistEx;
import java.util.Collections;
import java.util.LinkedList;

public class Linkedlisttwo {
    public static void main(String[] args) {
        LinkedList<String >enames=new LinkedList<String>();//here allowing only String values
        LinkedList data=new LinkedList();
        enames.add("Dhoni");
        enames.add("Hardik");
        enames.add("Virat");
        enames.add("Siraj");
        System.out.println(enames);

        //here using the sort linked list object
        Collections.sort(enames,Collections.reverseOrder());
        System.out.println(enames);

    }
}
