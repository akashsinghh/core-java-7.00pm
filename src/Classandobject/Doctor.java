package Classandobject;

public class Doctor {
    String name;
    int age;
    String depatment;
    int salary;

    public Doctor(String name, int age, String depatment, int salary) {
        this.name = name;
        this.age = age;
        this.depatment = depatment;
        this.salary = salary;
    }
    // getter setter method


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

    public String getDepatment() {
        return depatment;
    }

    public void setDepatment(String depatment) {
        this.depatment = depatment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Doctor obj=new Doctor("Shubi",22,"Mbbs",68000);
        System.out.println(obj.name+" "+obj.age+" "+obj.depatment+" "+obj.salary);
        // set method Read data
        obj.setName("Shubhami sharma");
        obj.setAge(23);
        obj.setDepatment("MD");
        obj.setSalary(78000);
        System.out.println("update her name :"+ " "+ obj.getName());
        System.out.println("update her age :" +" "+ obj.getAge());
        System.out.println("update her department :" +" "+obj.getDepatment());
        System.out.println("update her salary :" + " "+obj.getSalary());


    }
}
