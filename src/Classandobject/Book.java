package Classandobject;

public class Book {
    // TODO MEMBER VARIABLE:Properties
    String name="java";
    int page=600;
    double price=400.50;
    //TODO access_specifier return type function name(Parameter){
    //return_type--> output of fxn,void:if no output is determine

    //TODO access_specifier return type function name(Parameter){}
    public void readBook(){
        System.out.println("this is read fxn:");
    }
    public void writebook(){
        System.out.println("This is write fxn:");
    }

    public static void main(String[] args) {
        // todo object are instance of class
        //todo step1_createobjet  Syntax: classname  objectname=new classname();
        Book obj1=new Book();
        //step 2: method call: todo calling fxn--->object.fxnname
        obj1.readBook();
        obj1.writebook();
    }


}
