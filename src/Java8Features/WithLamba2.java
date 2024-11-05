package Java8Features;
interface functioni{
    public abstract int squareit(int num);
}
public class WithLamba2 {
    public static void main(String[] args) {
        functioni obj=num -> num*num;
        System.out.println(obj.squareit(10));//100
        System.out.println(obj.squareit(3));//9
    }

}
