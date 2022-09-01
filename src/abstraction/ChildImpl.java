package abstraction;
import java.util.*;

public class ChildImpl implements DemoInterface{
    @Override
    public void m1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a=sc.nextInt();
        System.out.println("Enter the second num: ");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("The total of :"+sum);

    } public void m2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a=sc.nextInt();
        System.out.println("Enter the second num: ");
        int b= sc.nextInt();
        int sub=a-b;
        System.out.println("The subtraction of :"+sub);
    }public void m3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a=sc.nextInt();
        System.out.println("Enter the second num: ");
        int b= sc.nextInt();
        int mul=a*b;
        System.out.println("The multiply of :"+mul);
    }
    public static void main(String[] args) {
        ChildImpl obj=new ChildImpl();
        obj.m1();
        obj.m2();
        obj.m3();
    }

}
