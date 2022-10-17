package OOOPPSS.abstraction.interfaceesss;

import OOOPPSS.abstraction.Demoabstraction;

public class ChildAbstraction extends Demoabstraction {
    @Override
    public void m1() {
        System.out.println("Hey:::");
    }

    public static void main(String[] args) {
        ChildAbstraction obj=new ChildAbstraction();
        obj.m1();
    }
}
