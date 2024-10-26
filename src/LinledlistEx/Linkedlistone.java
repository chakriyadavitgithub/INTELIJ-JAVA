package LinkedlistEx;
import java.util.Iterator;
import  java.util.LinkedList;

public class Linkedlistone {
    public static void main(String[] args) {
        LinkedList<String> enames=new LinkedList<String>();//here only the string values allowed
        LinkedList data=new LinkedList();//here allowing the heterogeneous elements
                enames.add("Jadeja");
                enames.add("Gill");
                enames.add("Panth");
                enames.add("Siraj");
        System.out.println(enames);
//by using the  iterator:for,while,dowhile,for each
        Iterator itr=enames.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (String ename:enames) {
            System.out.println(ename);
        }

    }
}
