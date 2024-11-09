package JAVA8F5DATEANDTIMEAPI;

import java.time.LocalDate;
import java.time.Period;

//by getting the dob & year,age,present year
public class DATEAPITWO {
    public static void main(String[] args) {
      LocalDate  dob= LocalDate.of(2003,8,17);
        System.out.println(dob);//2003-08-17

        LocalDate cdt=LocalDate.now();
        System.out.println(cdt);//2024-11-09

        Period pd= Period.between(dob,cdt);
        System.out.println(pd);//P21Y2M23D

        System.out.println(pd.getYears()+"/"+ pd.getMonths()+"/"+pd.getDays());//21/2/23
    }
}
