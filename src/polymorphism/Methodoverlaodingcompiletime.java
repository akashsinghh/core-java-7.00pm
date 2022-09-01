package polymorphism;

public class Methodoverlaodingcompiletime {
    public void add(int num1){
        System.out.println(num1);
    }
    public void add(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public void add(String a,double d){
        System.out.println(a+d);
    }
    public void add(int z,char ch){
        System.out.println(z+" "+ ch);
    }
    public static void main(String[] args) {
        Methodoverlaodingcompiletime obj=new Methodoverlaodingcompiletime();
        obj.add(4);
        obj.add("AKash",45.4);
        obj.add(4,6);
        obj.add(5,'A');
    }
}
