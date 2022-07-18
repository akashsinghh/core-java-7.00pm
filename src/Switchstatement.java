import java.util.*;
public class Switchstatement {
    public static void main(String[] args) {
        int a=10,b=5,ch;
        System.out.println("Enter the Case num : ");
        Scanner r=new Scanner(System.in);
        ch= r.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Sum : " + (a + b));
                break;
            case 2:
                System.out.println("sub : " + (a - b));

                break;
            case 3:
                System.out.print("mul : " + (a * b));
                break;
            case 4:
                System.out.println("div : " + (a / b));
                break;
            default:
                System.out.println("Not Valid");




        }
    }
}
