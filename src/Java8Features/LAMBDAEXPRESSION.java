//3.lambda expression means:no method name,no return type,no access modifier
package Java8Features;
interface daoi{
    public abstract  void login();///only decalaration
}
public class LAMBDAEXPRESSION {
    public static void main(String[] args) {
        daoi obj=()->{ ///lambda expression
            System.out.println("Login Success");
        };
        obj.login();
    }


}