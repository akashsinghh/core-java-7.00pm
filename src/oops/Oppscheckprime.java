package oops;
import java.util.Scanner;

public class Oppscheckprime {
   public void checkprimenum(){
       int num=14;
       boolean check =false;
       for(int i=2;i<num;i++){
           if(num%2==0){
               check=true;
                break;
           }
       }if(!(check)){
           System.out.println("the num is Prime: ");
       }
       else {
           System.out.println("the num is not prime: ");
       }
   }

}
