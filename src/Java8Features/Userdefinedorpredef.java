package Java8Features;
//here using the anotation
@FunctionalInterface
interface functionIone{
    //we can use apply also
    public  abstract int findlength(String ename);
}
public class Userdefinedorpredef {
    public static void main(String[] args) {
        functionIone obj=ename -> ename.length();
        //using the functioninterface either userdefined or predefined
        System.out.println(obj.findlength("Chakri"));//6
        System.out.println(obj.findlength("Virat Kohil"));//11
    }
}
