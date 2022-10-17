package OOOPPSS.polymorphosim;

public class DemoMethodoverloading {
    public void   add(int a,int b){
        int c=a+b;
        System.out.println(c);

    }
    public void add(int a,int b,int c){
       int d= a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        DemoMethodoverloading obj=new DemoMethodoverloading();
        obj.add(9,6);
        obj.add(4,8,9);

    }
}
