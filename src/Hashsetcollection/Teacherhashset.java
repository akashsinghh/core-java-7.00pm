package Hashsetcollection;

import model.Teacher;

import java.util.LinkedHashSet;

public class Teacherhashset {
   public  LinkedHashSet<Teacher>   createteacher(){
       LinkedHashSet<Teacher> identity=new LinkedHashSet<>();
       Teacher teacher=new Teacher("Manojbhaiya","Backenddeveloper",75000);
       Teacher teacher1=new Teacher("Akash","juniordeveloper",1000);
       Teacher teacher2=new Teacher("kumar","Intern",500);
       Teacher teacher3=new Teacher("kumar","Intern",500);
       identity.add(teacher);
       identity.add(teacher1);
       identity.add(teacher2);
       identity.add(teacher3);
       return identity;
   }

    public static void main(String[] args) {
        Teacherhashset obj=new Teacherhashset();
        LinkedHashSet<Teacher>  teachers=obj.createteacher();
        for(Teacher var:teachers){
            System.out.println(var.getName()+" "+var.getSubject()+" "+var.getSalary());
        }
    }

}
