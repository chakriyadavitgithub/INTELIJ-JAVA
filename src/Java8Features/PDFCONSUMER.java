package Java8Features;

import java.util.Arrays;
import java.util.List;
//PDF-Consumer-accept
interface PDFthree{
    public abstract int accept(List Number);
}
public class PDFCONSUMER {
    public static void main(String[] args) {
        List<Integer>al= Arrays.asList(10,20,30,40,50);
        PDFthree obj1=nums->nums.size();//lambda expression by using
        //and we use PDF OR UDF
        System.out.println(obj1.accept(al));///5
//here we take the acept
    }
}
