package abstraction;

public class Child extends Demoabstraction{

    @Override
    public void m1() {
        System.out.println("Hey now we use m1 method in child class: ");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();
        obj.m2();
    }
}
