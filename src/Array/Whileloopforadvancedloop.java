package Array;

import java.util.Scanner;

public class Whileloopforadvancedloop {
    public static void main(String[] args) {
//        int marks[]={4,5,8,9,7,2,4,2,8,2,5};
//        System.out.println("Printing elements"+marks[1]);
//        int i=0;
//
//        while(i<marks.length){
//            System.out.println("printing marks"+marks[i]);
//            i++;
//
//        }
//        for(i=0;i<marks.length;i++){
//            System.out.println("Printing elements"+marks[i]);
//        }
//        //Advanced for loop  (Datatype varname:ArrayName)code
//        for(int var:marks){
//            System.out.println("hey array is printing"+var);
//        }
        Scanner scn = new Scanner(System.in);
        // write ur code here
        System.out.println("please enter the number how many number ur checked: ");
        int t=scn.nextInt();

        for(int i=0;i<t;i++){
            System.out.println("Please Enter the number :");
            int n=scn.nextInt();

            boolean isPrime=false;
            for(int div=2;div<=n/2;div++){
                if(n%div==0){
                    isPrime=true;
                    break;
                }
            }
            System.out.println(isPrime?"notprime":"prime");
        }


    }

}
