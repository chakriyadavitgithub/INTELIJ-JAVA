package Java8Features;

import java.util.Random;

interface sone{
    public abstract int get();
}

public class PDFSUPPLIERINTERFACE implements sone{
    public int get(){
        Random r=new Random();
        return r.nextInt(200);//79
       // return 200;//200
    }

    public static void main(String[] args) {
        sone s1=new PDFSUPPLIERINTERFACE();
        System.out.println(s1.get());

    }
}
