package method;

public class Studentsss implements  Comparable<Studentsss>{
    int rollno;
    String name;
    int age;

    public Studentsss(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Studentsss st) {
        if (age==st.age){
            return 0;
        }
        else if(age>st.age){
            return 1;
        }else {
            return -1;
        }
    }
}

