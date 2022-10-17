package OOOPPSS.abstraction;

public class AbstractinChild extends Demoabstractn {

    @Override
    public void m1() {
        System.out.println("Hey akash what r u doing in child abstract");
    }

    public static void main(String[] args) {
        AbstractinChild obj=new AbstractinChild();
        obj.m1();
        obj.m2();
    }
}
