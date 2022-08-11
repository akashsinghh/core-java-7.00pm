package collection;

import java.util.ArrayList;

public class Linkedlist {
    public  void createarraylist(){
        ArrayList list=new ArrayList();
        list.add("noida");
        list.add("gzb");
        list.add(5);
        list.add(89.5);
        list.add("akashsinghakgec");
        list.add("ravi");
        list.add("vijay");
        list.add("ravi");
        list.add("vijay");
        //read data
        System.out.println("printing the elements: "+" "+list.get(0));
        System.out.println("printing the elements: "+" "+list.get(1));
        System.out.println("printing the elements: "+" "+list.get(2));
        System.out.println("printing the elements: "+" "+list.get(3));
        System.out.println("printing the elements: "+" "+list.get(4));
        System.out.println("printing the elements: "+" "+list.get(5));
        System.out.println("printing the elements: "+" "+list.get(6));
        System.out.println("printing the elements: "+" "+list.get(7));
        System.out.println("printing the elements: "+" "+list.get(8));
        // for loop
      for(int i=0;i< list.size();i++){
          System.out.println("Printed list loop: "+ i +"-->" +list.get(i));
      }
      int i=0;
      while (i< list.size()){
            System.out.println("Print  listing while loop: "+ i +"-->" +list.get(i));
            i++;
        }
      for(Object var:list){
          System.out.println("Print  listing advanced loop: "+ i +"-->" +var);
        }

    }
    public static void main(String[] args) {
        Linkedlist obj=new Linkedlist();
        obj.createarraylist();

    }

}
