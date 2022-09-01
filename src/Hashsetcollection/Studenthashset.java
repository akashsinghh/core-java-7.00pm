package Hashsetcollection;

import model.Student;

import java.util.HashSet;

public class Studenthashset {
    public HashSet<Student>  createstudent(){
        HashSet<Student> identity=new HashSet<>();
        Student student1=new Student("akash","It",140000);
        Student student2=new Student("akashkumar","It-1",130000);
        Student student3=new Student("akashkumar","It-1",130000);
        identity.add(student1);
        identity.add(student2);
        identity.add(student3);
        return identity;
    }
    public static void main(String[] args) {
        Studenthashset obj=new Studenthashset();
        HashSet<Student> students=obj.createstudent();
        for(Student var:students){
            System.out.println(var.getName());
            System.out.println(var.getSection());
            System.out.println(var.getFees());
        }
    }
}
