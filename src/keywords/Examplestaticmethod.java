package keywords;

public class Examplestaticmethod {

    String name;
    int rollno;
    static  String college="Akgec";
    //change the static name through the mathod
     static void change(){
        college="IET";
    }

    public Examplestaticmethod(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    void disply(){
        System.out.println("Printing then name: "+name);
        System.out.println("Printing then name: "+rollno);
        System.out.println("Printing then name: "+college);
    }

    public static void main(String[] args) {
         Examplestaticmethod.change();
         Examplestaticmethod st1=new Examplestaticmethod("Akashkumar",22);
         Examplestaticmethod st2=new Examplestaticmethod("Rahulkumar",26);
         st1.disply();
         st2.disply();


    }
}
