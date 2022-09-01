package model;

public class Employee {
    String name;
    String dept;
    int salary;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (!name.equals(employee.name)) return false;
        return dept.equals(employee.dept);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + dept.hashCode();
        result = 31 * result + salary;
        return result;
    }
}
