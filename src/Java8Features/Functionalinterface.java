//Functional interface & @(anotation) functional interface
package Java8Features;
@FunctionalInterface /////2.@interface anotation by using this it is restrict
///1.functional Interface by using this we get exceution.
interface Daoi{
    public  abstract  void login();//FI
    public abstract void logout();//@FI

}
//by using the @ we get some error
class Daoimpl implements Daoi {
    public void login() {
        System.out.println("Login Success");
    }
}
public  class Functionalinterface {
    public static void main(String[] args) {
        Daoi obj=new Daoimpl();
        obj.login();
    }
}
