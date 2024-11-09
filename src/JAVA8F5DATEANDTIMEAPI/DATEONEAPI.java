package JAVA8F5DATEANDTIMEAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class DATEONEAPI {
    public static void main(String[] args) {
        //Date & time Api
       LocalDate dt= LocalDate.now();//here we have use now
        LocalTime tm=LocalTime.now();

        //local date and year,month,year
        System.out.println(dt);//2024-11-09
        System.out.println(dt.getYear()+":"+ dt.getDayOfMonth()+":"+ dt.getDayOfYear());//2024:9:314

        //localtime hour,minute,seconds
        System.out.println(tm);//11:50:09.758142800
        System.out.println(tm.getHour()+":"+ tm.getMinute()+":"+ tm.getSecond());//11:55:40

    }
}
