import java.util.ArrayList;
import java.util.Collections;

public class Arraylistthree {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nancy");
        enames.add("Priya");
        enames.add("Bobby");
        enames.add("RRR");
       //sort arraylist object
        //sort is a inbuilt methods
        System.out.println(enames);
        Collections.sort((enames));//[Bobby, Nancy, Priya, RRR]

        //how to sort-using utility class ie Arrays,collections
        Collections.sort(enames,Collections.reverseOrder());//[RRR, Priya, Nancy, Bobby]
        System.out.println(enames);
    }
}
