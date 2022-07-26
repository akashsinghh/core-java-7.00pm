import java.util.Scanner;

public class Breakcontinue {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int num= sc.nextInt();
        for(int i=1;i<=10;i++){
            int output=num*i;
            if(output==27){
                continue;
            }
            System.out.println("table:  " + num +"x" + i + "=" +output);
        }
    }
}
