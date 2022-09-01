package model;

public class Teacher {
    String name;
    String subject;
    int salary;

    public Teacher(String name, String subject, int salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

        Teacher teacher = (Teacher) o;

        if (salary != teacher.salary) return false;
        if (!name.equals(teacher.name)) return false;
        return subject.equals(teacher.subject);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + subject.hashCode();
        result = 31 * result + salary;
        return result;
    }
}
