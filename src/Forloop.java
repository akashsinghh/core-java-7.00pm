import java.util.*;
  public class Forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int num= sc.nextInt();

        for (int i=1; i<=10; i++) {
            int output=num*i;
                System.out.println("table:  " + num +"x" + i + "=" +output);

        }
    }
}
