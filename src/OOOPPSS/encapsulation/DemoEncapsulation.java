package OOOPPSS.encapsulation;

public class DemoEncapsulation {
   private String name;
   private int rollno;
   public void display(){
       System.out.println(this.name);
       System.out.println(this.rollno);
       }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
       if(rollno<=0){
           throw new IllegalArgumentException("Invalid: ");
       }
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getName(){
//        return name;
//    }
//    public static void main(String[] args) {
//        DemoEncapsulation obj=new DemoEncapsulation();
//        obj.setName("Akash");
//        System.out.println(obj.getName());
//
//    }
}
