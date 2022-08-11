package Classandobject;

public class Person {
    String name="Akash";
    String Collegename="Akgec";
    int CollegeID=833654;
    String branch="IT";
    String Collegeaddress="GZB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegename() {
        return Collegename;
    }

    public void setCollegename(String collegename) {
        Collegename = collegename;
    }

    public int getCollegeID() {
        return CollegeID;
    }

    public void setCollegeID(int collegeID) {
        CollegeID = collegeID;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollegeaddress() {
        return Collegeaddress;
    }

    public void setCollegeaddress(String collegeaddress) {
        Collegeaddress = collegeaddress;
    }

    public static void main(String[] args) {
        Person obj1=new Person();
        System.out.println("NAME :"+" "+obj1.name);
        System.out.println("BRANCH :"+" "+obj1.branch);
        System.out.println("ADDRESS :"+" "+obj1.Collegeaddress);
        System.out.println("COLLGENAME :"+" "+obj1.Collegename);
        System.out.println("COLLEGE: "+" "+obj1.CollegeID);
       ;

    }
}
