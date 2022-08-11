package collection;

import com.sun.deploy.util.JVMParameters;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;

public class ArrayListGenerics {
    public  ArrayList<String> createwithgenerics(){
        //Syntax: collection <Datatype> objname=new collection
        //create a method  which will create a String ArrayList
        ArrayList <String> name =new ArrayList<>();
        name.add("akash kumar");
        name.add("rahul kumar");
        name.add("saurabh kumar");
        name.add("saumya pradhan");
        name.add("abcdefgh");
        return name;
    }
    //create a method  which will create a Integer ArrayList
    public ArrayList<Integer> createwithgenericss(){
        ArrayList <Integer> marks=new ArrayList<>();
        marks.add(4);
        marks.add(5);
        marks.add(5);
        marks.add(63);
        marks.add(645);
        marks.add(244646);
        marks.add(245);
        return   marks ;
    }
    //create a method  which will create a double ArrayList

    public ArrayList<Double> createwithdoublegenrics(){
        ArrayList <Double> price=new ArrayList <>();
        price.add(55.23);
        price.add(562.515);
        price.add(66.55);
        price.add(4654.55);
        return price;

    }


    public static void main(String[] args) {
        ArrayListGenerics obj=new ArrayListGenerics();
        ArrayList<String> name=obj.createwithgenerics();


       for(int i=0;i<name.size();i++){
           System.out.println("Priting the elements: "+ name.get(i));
       }
       for(String var:name){
           System.out.println("for loop name: "+var);

       }


        ArrayList<Integer> marks=obj.createwithgenericss();

       for(int i=0;i<marks.size();i++){
           System.out.println("Printinh thr list: "+ marks.get(i));
       }

        for(Integer var:marks){
            System.out.println("Print the for loop marks: "+var);

       }
        ArrayList<Double> price=obj.createwithdoublegenrics();

       for(int i=0;i<price.size();i++){
           System.out.println("Printing the  price: "+price.get(i));
       }
       for(Double var:price){
           System.out.println("Printing the elements for loop price: "+var);
       }
    }
}
