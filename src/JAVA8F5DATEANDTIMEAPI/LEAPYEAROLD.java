package JAVA8F5DATEANDTIMEAPI;

import java.time.LocalDate;

public class LEAPYEAROLD {
    public static void main(String[] args) {
        int year= LocalDate.now().getYear();
        System.out.println(year);//2024
        if (year%4 ==0){
            System.out.println("current year is leap year");//current year is leap year
        }
        else {
            System.out.println("Not a leap year");

        }
    }
}
