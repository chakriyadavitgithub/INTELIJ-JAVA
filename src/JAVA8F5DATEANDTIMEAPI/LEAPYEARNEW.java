package JAVA8F5DATEANDTIMEAPI;

import java.time.Year;

public class LEAPYEARNEW {
    public static void main(String[] args) {
       // Year year= Year.of(2023);
        Year year = Year.of(2024);
        //System.out.println("Yes Leap Year");
        if (year.isLeap()) {
            System.out.println(year+"Yes Leap Year");
        }
        else {
            System.out.println(year+" Not a Leap year");
        }
    }
}
