package Java8Features;
import java.util.Arrays;
import java.util.List;
interface pdfone{
    public abstract boolean test(List Numbers);
}//predefined and userdefined function
public class PDFUorP implements pdfone{//here with out static
    public boolean test(List Numbers){
        return Numbers.isEmpty();
    }

    public static void main(String[] args) {
        pdfone obj=new PDFUorP();
        List<Integer> al= Arrays.asList(10,20,30,30);
        boolean result =obj.test(al);
        System.out.println(result);//false
    }


}
