package abstraction;

public abstract class  Demoabstraction {
    //Syntax: access_specifier  abstracr keyword return type methodname(paramaeter);
    //Abtract Class: a class has at least one abstract method or  declared  with abstract keyword
    //can be create a object of abstract class?? Ansewer is no: we cannot create object of  abstract class
    //Reason :if we try to create  object and call abstract method then JVM will not able to find method code which should
    //be excuted
    //Now what were be used of abstract class:?
    //child class override abstract method and use as per requirements



    public abstract void m1(); //abstract method there is no code.
    public void m2(){
        System.out.println("this is m2 method: ");
    }

    public static void main(String[] args) {
        //Demoabstraction obj=new Demoabstraction();
    }

}
