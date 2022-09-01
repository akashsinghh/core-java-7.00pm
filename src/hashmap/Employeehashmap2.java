package hashmap;

import model.Employee;

import java.util.HashMap;

public class Employeehashmap2 {
    public HashMap<Integer, Employee> createEmployeehashmap() {
        HashMap<Integer, Employee> employee = new HashMap<>();
        Employee employee1 = new Employee("shubham", "CS", 54000);
        Employee employee2 = new Employee("shubhambaba", "elctronics", 54500);
        Employee employee3 = new Employee("Anurag", "civil", 5000);
        Employee employee4 = new Employee("Akash", "IT", 5400);
        employee.put(1,employee1);
        employee.put(2,employee2);
        employee.put(3,employee3);
        employee.put(4,employee4);
        return employee;

    }

    public static void main(String[] args) {
        Employeehashmap2 obj=new Employeehashmap2();
        HashMap<Integer, Employee> employee=obj.createEmployeehashmap();
        for(Integer var:employee.keySet()){
            System.out.println(employee.get(var).getName()+" "+employee.get(var).getDept()+" "+employee.get(var).getSalary());

        }
    }




}




