package polymorphism;

public class Childoverriding extends Methodoverridingruntime{
    @Override
    public void div() {
        int c=8;
        int d=4;
        int e=c/d;
        System.out.println(e);
    }

    @Override
    public void add() {
        int r=5;
        int c=6;
        int z=r+c;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Methodoverridingruntime obj=new Methodoverridingruntime();
        obj.div();
        obj.add();
        Methodoverridingruntime obj1=new Childoverriding();
        obj1.div();
        obj1.add();
    }
}
