package Loop;
import java.util.*;

public class Dowhileloop {

  public static void main(String[] args) {
      int i,j,isPrime,n;
      System.out.println("number 1 to 1000: ");
      for(i=2;i<=1000;i++){
          isPrime=0;
          for (j=2;j<=i/2;j++){
              if(i%j==0){
                  isPrime=1;
                  break;
              }
              if(isPrime==0){
                  System.out.print(i+" ");
              }
          }
      }
//        Scanner a = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num = a.nextInt();
//        boolean flag = false;
//        for (int i = 2; i<=num; i++) {
//            if (num % i == 0) {
//
//                flag = true;
//                break;
//            }
//        }
//        if (flag) {
//            System.out.println("num is prime");
//        } else {
//            System.out.println("Number is not prime");
//        }

    }


}


