package LinkedlistEx;
import java.util.ArrayList;
import  java.util.LinkedList;

public class ALvsLLEx {
    public static void main(String[] args) {
        ArrayList<String>al_list=new ArrayList<String>();
        al_list.add("Nancy");//0
        al_list.add("priya");//1
        al_list.add("oleva");//2
        al_list.add("prabhas");//3
        //al_list.set(3,"Siri");///here we replacing the values by using the set.
        System.out.println(al_list);

        LinkedList<String>ll_list=new LinkedList<String>();
        ll_list.add("Damon");//0
        ll_list.add("Elena");//1
        ll_list.add("Stefan");//2
        ll_list.add("Klaus");//3
        //ll_list.set(2,"Eliaz");//here we replacing the values by using the set.
        System.out.println(ll_list);

        al_list.remove(0);
        ll_list.removeFirst();//0

        al_list.remove(al_list.size()-1);//3
        ll_list.removeLast();

        System.out.println(al_list);
        System.out.println(ll_list);
    }
}
