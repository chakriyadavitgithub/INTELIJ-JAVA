package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Hashtable {
    public static void main(String[] args) {
        Map<String,String> emp=new HashMap<String,String>();
        Map<String,String> emp1=new java.util.Hashtable<String,String>();

        emp.put("eid","100");
        //emp.put("ename","RRR");
        emp.put(null,"OG");
        //in hashmap the null are allowed by once

        System.out.println(emp);//{eid=100, ename=OG}

        emp1.put("eid","506");
        emp1.put("name","Pushpa");
        //emp1.put("String","RG");//here string will be allowed by that place
        System.out.println(emp1);//{eid=506, name=Pushpa}
        //in hashtable the null are not allowed



    }
}
