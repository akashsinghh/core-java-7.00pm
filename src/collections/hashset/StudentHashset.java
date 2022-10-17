package collections.hashset;

import model.Student;

import java.util.HashSet;

public class StudentHashset {
    public    HashSet<Student> createStudent(){
        HashSet<Student> data=new HashSet<>();
        Student student=new Student("Akash","IT",158000);
        System.out.println("Student hashcode: "+student.hashCode());
        Student student1=new Student("Nishtha","IT",145201);
        System.out.println("Student hashcode1: "+student1.hashCode());
        Student student2=new Student("Anoop","IT",145000);
        System.out.println("Student hashcode2: "+student2.hashCode());
        Student student4=new Student("Akash","IT",158000);
        System.out.println("Student hashcode3: "+student4.hashCode());
        data.add(student);
        data.add(student1);
        data.add(student2);
        data.add(student4);
        return data;


    }

    public static void main(String[] args) {
        StudentHashset obj=new StudentHashset();
        HashSet<Student> students=obj.createStudent();
        for(Student var:students){
            System.out.println(var.getName()+" "+var.getSection()+" "+var.getFees());
        }
    }

}
