package HashMaps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Hashmapone {
    public static void main(String[] args) {
    HashMap<String,String>employe=new HashMap<String,String>();//by using the hashmap
    ArrayList<String> al=new ArrayList(Arrays.asList(101,102,103));
        System.out.println(al);//[101, 102, 103]
        System.out.println(employe);//{}

        employe.put("eid","206");//for adding purpose we have to use (put)
        employe.put("ename","Saaho");
        employe.put("esalary","500000");
        employe.put("Loc","Bangalore");
        System.out.println(employe);//{eid=206, Loc=Bangalore, ename=Saaho, esalary=500000}

        //fetch the values by using the (get)
        ///display the all the values :Map object values:get method
        System.out.println(employe.get("eid"));//206
        System.out.println(employe.get("ename"));//saaho
        System.out.println(employe.get("esalary"));//50000
        System.out.println(employe.get("Loc"));//Bangalore
    }
}
