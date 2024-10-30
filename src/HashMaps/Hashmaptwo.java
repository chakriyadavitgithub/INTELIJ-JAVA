package HashMaps;
import java.security.Key;
import java.util.*;

public class Hashmaptwo {
    public static void main(String[] args) {
       HashMap<String,String>product= new HashMap<String,String>();
        System.out.println(product);//{}
       product.put("p_Id","108");
       product.put("p_name","Dairymilk");
       product.put("price","50");
       product.put("discount","NO");
        System.out.println(product);//{p_name=Dairymilk, price=50, discount=NO, p_Id=108}

    //1.print all key:values pairs -using the Keyset():
        //2.print all using the values-using entry set();
        //3.print all key:values-using the entry set();
        //4.by using foreach

//        Set<String> keys=product.keySet();
//        System.out.println(keys);//[p_name, price, discount, p_Id]
//        for (String key:keys){
//            System.out.println(key+":"+product.get(key));//p_name:Dairymilk
//        }

//        Collection<String> values=product.values();
//        System.out.println(values);//[Dairymilk, 50, NO, 108]
//        for (String value:values){
//            System.out.println(value);//Dairymilk in line
//        }

        Set<Map.Entry<String,String>> entries=product.entrySet();
        System.out.println(entries);//[p_name=Dairymilk, price=50, discount=NO, p_Id=108]
        for (Map.Entry<String,String>entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
             //p_name:Dairymilk
            //price:50
        }

        }



    }

