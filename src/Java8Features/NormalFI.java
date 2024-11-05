package Java8Features;
interface functionthree{
    public abstract int findByLength(String ename);
}
public class NormalFI implements functionthree {
    public int findByLength(String ename){
        return ename.length();
    }
    //from here using the normal function interface
    //and not using the lambda expression

    public static void main(String[] args) {
        //here we can use the normalfi or function three no prbl
        functionthree obj=new NormalFI();
        System.out.println(obj.findByLength("Chakri"));//6
        System.out.println(obj.findByLength("Balaji"));//6
        System.out.println(obj.findByLength("Srinivas"));//8
    }
}
