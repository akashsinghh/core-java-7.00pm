package Casestatement;

import java.util.Scanner;

public class Calcif {
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int  subtract(int a,int b){
        int sub=a-b;
        return sub;
    }
    public int  multiply(int a,int b){
        int mul=a*b;
        return mul;
    }
    public int  divide(int a,int b){
        int div=a-b;
        return div;
    }
    public int square(int num){
        int sq=num*num;
        return sq;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        Calcif obj1=new Calcif();
        String flag="Y";
        while (flag.equals("Y")){
            System.out.println("Enter the num A: ");
            int a=obj.nextInt();

            System.out.println("Enter the num B: ");
            int b=obj.nextInt();
            System.out.println("Please enter ur cboice :1-->add,2->sub,3->mul,4->div,5->square");

            int choice=obj.nextInt();




            if(choice==1) {
                int plus = obj1.add(a, b);
                System.out.println("print the numa add: " + plus);
            }
            else if( choice==2){
                int minus=obj1.subtract(a,b);
                System.out.println("print the numa sub: "+minus);
            } else if (choice==3) {
                int multi=obj1.multiply(a,b);
                System.out.println("print the numa mul: "+multi);
            } else if (choice==4) {
                int divid=obj1.divide(a,b);
                System.out.println("print the numa divide: "+divid);

            }
            System.out.println("Please press Y to stop calc or press any button to continue: ");
            Scanner obj2=new Scanner(System.in);
            flag=obj2.nextLine();
//        else if (choice==5) {
////            int squar= obj1.square(num);
////            System.out.println("print the num swuare: "+squar );
////
////        }
//            else {
//                System.out.println("print invalid inpit :");
//
//            }

        }


    }

}
