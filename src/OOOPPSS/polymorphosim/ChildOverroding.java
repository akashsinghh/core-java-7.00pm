package OOOPPSS.polymorphosim;

public class ChildOverroding extends  Runtimepoly{
    public void m1(){
        System.out.println("This is Childoverriding");
    }
    public void m2(){
        System.out.println("This is Childoverriding2");
    }

    public static void main(String[] args) {
        Runtimepoly obj=new Runtimepoly();
        obj.m1();
        ChildOverroding obj1=new ChildOverroding();
        obj1.m1();
        Runtimepoly obj2=new ChildOverroding();
        obj2.m2();
    }

}
