package Loop;
import java.util.*;

public class Dowhileloop {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = a.nextInt();
        boolean flag = false;
        for (int i = 2; i<=num; i++) {
            if (num % i == 0) {

                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("num is prime");
        } else {
            System.out.println("Number is not prime");
        }

    }


}


