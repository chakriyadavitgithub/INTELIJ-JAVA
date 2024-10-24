package  Arrayliste;
import java.util.ArrayList;
public  class Test {
    public static void main(String[] args) {
        //here by using the

        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Nancy");
        enames.add("Priya");
        enames.add("Bobby");
        enames.add("RRR");
        //1.for loop
        for (int i = 0; i < enames.size() - 1; i++) {
            System.out.println(enames.get(i));
        }
        //2.while loop
        int i = 0;
        while (i <= enames.size() - 1) {
            System.out.println(enames.get(i));
            i++;
        }
        //3.do while loop
        int index = 0;
        do {
            System.out.println(enames.get(index));
            index++;
        }
        while (i<= enames.size()- 1);
    }

    }

