package collections.hashmap;

import model.Student;

import java.util.HashMap;

public class StudentHashmap {
    public HashMap<Integer, Student> createhashmap() {
        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        Student student1 = new Student("Ritu", "2", 12541);
        Student student2 = new Student("Samrikha", "Bio", 12564);
//        studentHashMap.containsKey(1){
//            if(studentHashMap.containsKey("1"))}
//        System.out.println("key is present");
//       }
//         else{
//        System.out.println("NOt present");
//        }
//        //add student
//        studentHashMap.put(1, student1);
//        studentHashMap.put(2, student2);
//
        return studentHashMap;

    }
    public static void main(String[] args)
    {
        StudentHashmap obj=new StudentHashmap();
        HashMap<Integer, Student> studentsss=obj.createhashmap();


        for(Integer var:studentsss.keySet())
        {
            System.out.println("printing the student ..:"+studentsss.get(var).getName());
            System.out.println("printing the student ..:"+studentsss.get(var).getSection());
            System.out.println("printing the student ..:"+studentsss.get(var).getFees());

        }

    }



}
