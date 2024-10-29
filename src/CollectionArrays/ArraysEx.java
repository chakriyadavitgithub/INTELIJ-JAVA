package LinkedHashset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import  java.util.List;

public class ArraysEx {
    public static void main(String[] args) {
        //ArrayList eids=new ArrayList(Arrays.asList(101,102,103,104));
        //System.out.println(eids);
        Integer[] eids={101,102,103,104,206};//here created the arrays
         //and this is the collection of arrays

        List<Integer>emp_ids=Arrays.asList(eids);
        Collections.sort(emp_ids);//and here by using the sort
        System.out.println(emp_ids);
    }

}
