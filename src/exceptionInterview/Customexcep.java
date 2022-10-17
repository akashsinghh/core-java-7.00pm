package exceptionInterview;

import java.util.List;

public class Customexcep  {
    public void  dovoting(int age)throws Agenot{
        

        if(age>18){
            System.out.println("welcome to voting: ");
        }else {
            throw new Agenot("Age is not eligible :");
        }
    }

    public static void main(String[] args) {
        Customexcep obj=new Customexcep();

        try{
            obj.dovoting(12);

        }
        catch (Exception e){
            System.out.println("Exception occured:");
        }
    }
}

