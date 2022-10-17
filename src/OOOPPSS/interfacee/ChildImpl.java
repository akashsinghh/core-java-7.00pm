package OOOPPSS.interfacee;

public class ChildImpl implements Demointerface{
    @Override
    public void m1() {
        System.out.println("This is m1: ");
    }

    @Override
    public void m2() {
        System.out.println("This is m2");

    }

    public static void main(String[] args) {
        ChildImpl obj=new ChildImpl();
        obj.m1();
        obj.m2();
    }
}
