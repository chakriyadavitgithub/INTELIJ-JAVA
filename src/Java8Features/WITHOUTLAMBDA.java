package Java8Features;
interface Functioni{
    public abstract int squareIt(int num);
}
public class WITHOUTLAMBDA implements Functioni {
    public int squareIt(int num){
        return num*num;
    }

    public static void main(String[] args) {
        Functioni obj=new WITHOUTLAMBDA();
        System.out.println(obj.squareIt(20));//400
        System.out.println(obj.squareIt(5));//25
    }
}
