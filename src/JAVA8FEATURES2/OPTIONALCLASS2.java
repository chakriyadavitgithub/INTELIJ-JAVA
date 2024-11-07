package JAVA8FEATURES2;

import java.util.Optional;
//how to resolve the null pointer exception error
//by using try & catch
//by using the optional classes
public class OPTIONALCLASS2 {
    public static void main(String[] args) {
     String ename="Nancy";//the name will be excetute and null points are not possible
       System.out.println(ename.length());//5

        String ename1 = null;//null value will be excetute
        //bcoz we are using the optional clasees
        Optional<String> opt = Optional.ofNullable(ename1);
        if (opt.isPresent()) { //here using the is present keyword also
            System.out.println(opt.get().length());
        }
        System.out.println("Java*8 Features");
    }
}
