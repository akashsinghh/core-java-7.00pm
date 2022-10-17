package model;

public class Student {
    String name;
    String section;
    int fees;

    public Student(String name, String section, int fees) {
        this.name = name;
        this.section = section;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (fees != student.fees) return false;
        if (!name.equals(student.name)) return false;
        return section.equals(student.section);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + section.hashCode();
        result = 31 * result + fees;
        return result;
    }
}
