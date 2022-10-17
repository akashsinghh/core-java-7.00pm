package Array;
import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

  public class Testcase {
      public static void main(String[] args) {
          String s = "java";
          char ch[] = {'s', 't', 'r', 'i', 'n', 'g'};
          // converting char to string
          String s1 = new String(ch);
          String s2 = new String("Example");
          System.out.println(s);
          System.out.println(s1);
          System.out.println(s2);


      }

  }
     // linkedlist
    /* public static void main(String[] args) {
         ArrayList<String> list=new ArrayList<>();
         list.add("akash");//adding object in arraylist
         list.add("rahul");
         list.add("saumya");
         list.add("akash");
         //traversing list through iterator
         Iterator itr= list.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }

     }*/

      //linkedlist
    /* public static void main(String[] args) {
         LinkedList<String> al=new LinkedList<>();
         al.add("ravi");
         al.add("vijay");
         al.add("ravi");
         al.add("vijay");
         Iterator<String> itr= al.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }

     }*/

      //vector
    /*  public static void main(String[] args) {
          Vector<String> al=new Vector<>();
          al.add("ravi");
          al.add("vijay");
          al.add("ravi");
          al.add("vijay");
          Iterator<String> itr= al.iterator();
          while (itr.hasNext()){
              System.out.println(itr.next());
          }

      }*/
      //Stack is subclass of vector; lifo
     /* public static void main(String[] args) {
          Stack<String> al=new Stack<String>();
          al.push("ravi");
          al.push("vijay");
          al.push("ravi");
          al.push("vijay");
          Iterator<String> itr= al.iterator();
          while (itr.hasNext()){
              System.out.println(itr.next());
          }

//      }*/
//      //Priority queue inteface fifo
//      public static void main(String[] args) {
//          PriorityQueue<String> queue=new PriorityQueue<>();
//
//          queue.add("AKash Singh");
//          queue.add("rahul");
//          queue.add("anoop");
//          System.out.println("head:"+queue.element());
//          System.out.println("head: " + queue.peek());
//          System.out.println("iterating the queue elements:");
//          Iterator itr= queue.iterator();
//          while (itr.hasNext()){
//              System.out.println(itr.next());
//          }
//          queue.remove();
//          queue.poll();
//          System.out.println("after removing elementsL:");
//          Iterator<String> itr2=queue.iterator();
//          while (itr.hasNext()){
//              System.out.println(itr2.next());
//          }
//
//      }
//
//}
