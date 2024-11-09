package JAVA8FEATURES4STREAMAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//print all enames their names starts with '/p' with out stream & with stream
public class StreamApiFour {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("Harsha", "king", "pooja", "pushpa", "priya",
                "prakash", "RRR", "Salaar", "nancy", "sunny","Honey", "bunny");
        List<String> new_users = new ArrayList<String>();
        //here by using the for each and if with the help of startswith
        ///we have select the names for particulat alphabet then we can use this method
        //and it is with out stream
        for (String ename : enames) {
            if (ename.startsWith("p")) {
                new_users.add(ename);
            }
        }
        System.out.println(enames);
        System.out.println(new_users);//[pooja, pushpa, priya, prakash]
        ///from here iterator is not possible

    }
    }
