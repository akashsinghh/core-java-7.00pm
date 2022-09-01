package polymorphism;

public class Methodoverridingruntime {
    public void div(){
        int a=4;
        int b=2;
        int c=a/b;
        System.out.println(c);
    }
    public void add(){
        int a=4;
        int b=2;
        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Methodoverridingruntime obj=new Methodoverridingruntime();
        obj.div();
        obj.add();
    }
}
