package JAVA8STREAMAPI2PDF;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PDF10 {
    public static void main(String[] args) {
        List<Integer>Asec_Desc_Numbers= Arrays.asList(1,2,4,5,8,9,10,22,33,44,11,28);
        ///By using the stream Asec order
        //by using the sorted
        List<Integer>sorted_Num=Asec_Desc_Numbers.stream()
                .sorted()
                .collect(Collectors.toList());//we can use
        System.out.println("ASEC_NUM :"+sorted_Num);//[1, 2, 4, 5, 8, 9, 10, 11, 22, 28, 33, 44]

        ///Desc order
        List<Integer>Reverse_Num=Asec_Desc_Numbers.stream()
                .sorted(Collections.reverseOrder())//by using this reverse order weget
                .collect(Collectors.toList());
        System.out.println("DESC_NUM"+Reverse_Num);

    }

}
