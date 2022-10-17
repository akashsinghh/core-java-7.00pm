package collections.hashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplcatesarraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");
        Set<String> s=new LinkedHashSet<String>(list);
        System.out.println(s);
//        List<String> names= new ArrayList<>();
//        names.add("Akash");
//        names.add("Rahul");
//        names.add("Rahul");
//        System.out.println(names);
//        Set<String> s=new LinkedHashSet<String>(names);
//        System.out.println(s);
    }
}
