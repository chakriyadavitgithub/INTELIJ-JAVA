package Hashsetone;
import java .util.HashSet;
import java.util.Iterator;

public  class Hashsetone {
    public static void main(String[] args) {
        HashSet hs1= new  HashSet();//allowed the heterogeneous elements
        HashSet hs2= new  HashSet<>();
        HashSet hs3=new HashSet<Integer>(100);
        HashSet hs4=new HashSet<Float>(200,0.8f);

        hs1.add(206);
        hs1.add(5000);
        hs1.add("Chakri");
        hs1.add("Bangalore");
        hs1.add("Bangalore");
        hs1.add("chakriyadav@gmail.com");
        hs1.add("Chakri");//don't allow the duplicate values
        hs1.add(null);
        System.out.println(hs1);//[null, 5000, chakriyadav@gmail.com, Chakri, 206, Bangalore]


        //iterator Hashset object-using for each
        for (Object obj:hs1)
            System.out.println(obj);

        //iterator hashset object using the iterator() method
        Iterator itr= hs1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        for (int i=0;i<=hs1.size()-1;i++){
////            //System.out.println("gm");
////        }

    }
}