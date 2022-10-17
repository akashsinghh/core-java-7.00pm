package Casestatement;

import java.util.Scanner;
public class Variablemanuplation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("ENTER THE MARKS1");
        int marks=scn.nextInt();
        System.out.println("ENTER THE MARKS2");
        int mark=scn.nextInt();
        System.out.println("ENTER THE MARKS3");
        int marksS=scn.nextInt();
        if(marks>80){
            System.out.println("Person is first devision");
        }
        else{
            System.out.println("person Not get first devision");
        }
        if(marks>=70){
            System.out.println("Person get second division and equal to ");
        }else {
            System.out.println("Person not gert second and equal to ");
        }
        if(marks>35){
            System.out.println("person get third position");
        }else {
            System.out.println("Not get third person");
        }

    }
}
