package Casestatement;

public class Calcoutput {
    public int add(int a,int b){
        int result=a+b;
        return  result;
    }public int sub(int a,int b){
        int result=a-b;
        return  result;
    }public double div(int a,int b){
        double result=a/b;
        return  result;
    }public int square(int num){
        int result=num*num;
        return result;
    }
    public static void main(String[] args) {
        Calcoutput obj=new Calcoutput();
        int add=obj.add(5,9);
        System.out.println("Print add:"+add);
        int sub= obj.sub(9,6);
        System.out.println("printing sub: "+sub);
        double div=obj.div(64,8);
        System.out.println("printinf divisble :"+div);
        int square= obj.square(5);
        System.out.println("printing square: "+square);

    }
}
