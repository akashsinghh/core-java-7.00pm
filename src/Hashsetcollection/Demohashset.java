package Hashsetcollection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demohashset {
    public LinkedHashSet<Integer> creatinghashset(){
        LinkedHashSet<Integer> marks=new LinkedHashSet<>();
        marks.add(2);
        marks.add(5);
        marks.add(2);
        marks.add(5);
        return marks;
    }public  LinkedHashSet<Double> createhashet(){
        LinkedHashSet<Double> number=new LinkedHashSet<Double>();
        number.add(542.66);
        number.add(945.56);
        number.add(542.66);
        number.add(542.66);
        number.add(945.56);
        number.add(542.66);
        return number;
    }
    public static void main(String[] args) {
        Demohashset obj=new Demohashset();
        HashSet<Integer> marks=obj.creatinghashset();
        for (Integer var:marks){
            System.out.println("Printing the marks: "+var);
        }
        HashSet<Double> number=obj.createhashet();
        for (Object var:number){
            System.out.println("Printing the numbers: "+var);
        }
    }
}
