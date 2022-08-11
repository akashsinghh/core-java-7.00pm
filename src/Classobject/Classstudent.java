package Classobject;

import javax.management.ObjectName;

public class Classstudent {
    String name;
    int age;
    String branch;
    //normal constructor
    public Classstudent(){

    }

    //parametrized constructor
    public Classstudent(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }
    //getter setter method


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    //method create
    public Classstudent Createobject(){
        Classstudent object=new Classstudent("rahul",26,"Civil");
        return object;
    }
    //dynamic create
    public Classstudent createobjectwithparameter(String name,int age,String branch){
        Classstudent object=new Classstudent(name,age,branch);
        return object;

    }
    public static void main(String[] args) {
        Classstudent object=new Classstudent("akash",24,"IT");
       // object = Object.Createobject();
        System.out.println(object.name +" "+ object.age+" "+ object.branch);
        //change the name from akash to akashkumar
        object.setName("Akash kumar");
        object.setAge(25);
        object.setBranch("Civil");
        //reading name
        System.out.println("update name is" + object.getName());
        System.out.println("update name is" + object.getAge());
        System.out.println("update name is" + object.getBranch());

        Classstudent obj1=new Classstudent("rahul",26,"civil");
        //Change his name
        obj1.setName("Rahul kumar Bro");
        obj1.setAge(27);
        obj1.setBranch("IT");
        System.out.println("Update his name"+obj1.getName()+ " " + obj1.getAge() +" "+ obj1.getBranch());

        Classstudent obj2=new Classstudent("Nishtha",24,"IT");
        //change her name
        obj2.getName();
        obj2.getBranch();
        obj2.getAge();
        System.out.println("Update her data" +" " +obj2.getName()+" "+obj2.getAge()+" "+obj2.getBranch());


//        Object=Object.createobjectwithparameter("Saumya",26,"civil");
//        System.out.println(Object.name);
//        System.out.println(Object.age);
//        System.out.println(Object.branch);


    }
}
