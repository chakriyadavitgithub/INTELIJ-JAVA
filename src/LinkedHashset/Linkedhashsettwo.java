package LinkedHashset;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkedhashsettwo {
    public static void main(String[] args) {
        LinkedHashSet<String> enames1 = new LinkedHashSet<String>();
        enames1.add("Siri");
        enames1.add("Nancy");
        enames1.add("Ola");
        enames1.add("Ronaldo");
        enames1.add(null);
        //System.out.println(enames1);
        //Iterate Linked hashset

        //by using the for each
        for (String ename:enames1){
            System.out.println(ename);
        }

        Iterator itr= enames1.iterator();
        while (itr.hasNext()){
            //System.out.println(itr.next());
        }

        }
}
