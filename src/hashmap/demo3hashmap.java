package hashmap;

import model.Student;

import java.util.HashMap;
import java.util.Set;
import java.util.logging.Handler;

public class demo3hashmap {
    public HashMap<Integer,Student> createdemo(){
        HashMap<Integer,Student> student=new HashMap<>();
        Student student1=new Student("akash","It",140000);
        Student student2=new Student("akashkumar","It-1",130000);
        Student student3=new Student("akashkumar1","It-3",30000);
        Student student4=new Student("akashkum","It-2",1000);
        student.put(1,student1);
        student.put(2,student2);
        student.put(3,student3);
        student.put(4,student4);
        return student;
    }

    public static void main(String[] args) {
        demo3hashmap obj=new demo3hashmap();
        //Set<Integer> keys=student.keySet();
        HashMap<Integer,Student> student=obj.createdemo();
        for(Integer var:student.keySet()){
            System.out.println(student.get(var).getName()+" "+student.get(var).getSection()+" "+student.get(var).getFees());    }
    }
}
