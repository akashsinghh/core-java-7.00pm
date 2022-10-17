package collections.hashset;

import java.util.HashSet;

public class Demohashset {
    public  HashSet<String> createString(){
        HashSet<String> course=new HashSet<>();
        course.add("Java");
        course.add("Spring");
        course.add("SpringBoot");
        course.add("Java");
        course.add("Spring");
        course.add("SpringBoot");
        return course;

    }

    public static void main(String[] args) {
        Demohashset obj=new Demohashset();
        HashSet<String> course = obj.createString();
        for(String var:course){
            System.out.println("Printing the course: "+var);
        }

    }
}
