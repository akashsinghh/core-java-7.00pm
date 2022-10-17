package OOOPPSS.abstraction.interfaceesss;

public class childimp implements  Interfacedemo{
    @Override
    public void m1() {
        int a=4;
        int b=5;
        int c=a+b;
        System.out.println("addition: "+c);

    }

    @Override
    public void m2() {
        int a=41;
        int b=5;
        int c=a-b;
        System.out.println("subtraction: "+c);

    }

    @Override
    public void m3() {
        int a=4;
        int b=5;
        int c=a*b;
        System.out.println("multiply:"+c);

    }

    public static void main(String[] args) {
        childimp obj=new childimp();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
