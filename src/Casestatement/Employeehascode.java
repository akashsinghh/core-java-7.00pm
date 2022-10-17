package Casestatement;

import model.Employee;

import java.util.HashSet;

public class Employeehascode {
    public   HashSet<Employee> createhascode(){
        HashSet<Employee> empidentity=new HashSet<>();
        Employee employee=new Employee("Akash","IT",780000);
        System.out.println("hascode: "+employee.hashCode());


        Employee employee1=new Employee("Akashkum","IT",70000);
        System.out.println("hascode1: "+employee1.hashCode());

        Employee employee2=new Employee("Akashsingh","IT",80000);
        System.out.println("hascode2: "+employee2.hashCode());

        Employee employee3=new Employee("Akashsingh","IT",80000);
        System.out.println("hascode3: "+employee3.hashCode());

        Employee employee4=new Employee("rahul","Civil",6600);
        System.out.println("hascode4: "+employee4.hashCode());

        Employee employee5=new Employee("rahul","Civil",6600);
        System.out.println("hascode4: "+employee4.hashCode());

        empidentity.add(employee);
        empidentity.add(employee1);
        empidentity.add(employee2);
        empidentity.add(employee4);
        return  empidentity;
    }

    public static void main(String[] args) {
        Employeehascode obj=new Employeehascode();
        HashSet<Employee> employees=obj.createhascode();
        for (Employee var:employees){
            System.out.println(var.getName());
            System.out.println(var.getDept());
            System.out.println(var.getSalary());
        }
    }
}
