package Java8Features;

import java.util.Arrays;
import java.util.List;

interface pdffour{
    public abstract int apply(List nums);
}
///And this is consumer nrml with out static
public class PDFCONSUMERNRML implements pdffour {
    public int apply (List nums){
        return nums.size();
    }

    public static void main(String[] args) {
        pdffour obj1=new PDFCONSUMERNRML();
        List<Integer> al= Arrays.asList(10,200,300,400);
        System.out.println(obj1.apply(al));///4
    }
}
