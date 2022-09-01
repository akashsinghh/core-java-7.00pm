package Hashsetcollection;

import java.util.HashSet;

public class Demohashset {
    public HashSet<Integer> creatinghashset(){
        HashSet<Integer> marks=new HashSet<>();
        marks.add(2);
        marks.add(5);
        marks.add(2);
        marks.add(5);
        return marks;
    }public  HashSet<Double> createhashet(){
        HashSet<Double> number=new HashSet<Double>();
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
