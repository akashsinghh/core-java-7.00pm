package Classandobject;

public class Engineer {
    String name;
    String specializations;
    String phoneno;
    double salary;
    // access specifier return type method name(parameter){code};
    public void Engineername(){
        System.out.println("My name is :"+"Akash");
    }
    public void Engineerspecialization(){
        System.out.println("My specialization is : "+"IT");
    }
    public void Engineerphoneno(){
        System.out.println("Engineer phone num: "+"8273040687");
    }
    public  void Engineersalary(){
        System.out.println("Engineer salary: "+55000.22);
    }


    public static void main(String[] args) {
        Engineer obj=new Engineer();
        obj.Engineername();
        obj.Engineerspecialization();
        obj.Engineerphoneno();
        obj.Engineersalary();
    }
}
