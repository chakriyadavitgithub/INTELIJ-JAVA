package JAVA8FEATURES4STREAMAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("Nancy","priya","Rolex","Oleva");
        ArrayList<String>users=new ArrayList<String>();
        users.add("Nancy");
        users.add("priya");
        users.add("Rolex");
        users.add("Oleva");
        System.out.println(enames);//[Nancy, priya, Rolex, Oleva]
        System.out.println(users);//[Nancy, priya, Rolex, Oleva]

        //here the names should be coneverting into the uppercase
        ArrayList<String>new_users=new  ArrayList<String>();
        for (String user:users){
            new_users.add(user.toUpperCase());
        }
        System.out.println(new_users);
    }
}
