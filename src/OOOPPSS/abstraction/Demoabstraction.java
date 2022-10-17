package OOOPPSS.abstraction;

public abstract class Demoabstraction {
    // abstract claass:: a class have atleast one abstract method  or declared with abstract method
    //can we create  object of abstract  class?? NO:: we cannot create object of abstract class;
    //reason:: bcz there is no code in abstract method so jvm will not able to find method
    //so there is reason only child class will used this method
    //abstract method hiding the details

    public abstract void m1();

    public void m2() {
        System.out.println("Hey: ");
    }

    public static void main(String[] args) {
      //  Demoabstraction obj = new Demoabstraction()
    }
}
