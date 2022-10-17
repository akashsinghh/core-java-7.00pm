package model;

public class Engineer implements Comparable<Engineer> {
    private  String name;
    String phone;
    int Engid;
    @Override
    public int compareTo(Engineer o) {
        return this.Engid-o.Engid;
    }


    public Engineer(String name, String phone, int engid) {
        this.name = name;
        this.phone = phone;
        Engid = engid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEngid() {
        return Engid;
    }

    public void setEngid(int engid) {
        Engid = engid;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", Engid=" + Engid +
                '}';
    }


}
