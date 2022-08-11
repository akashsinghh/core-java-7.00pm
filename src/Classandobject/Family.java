package Classandobject;

public class Family {
    String name;
    String sistername;
    int familymember;
    String address;

    public Family(){

    }

    public Family(String name, String sistername, int familymember, String address) {
        this.name = name;
        this.sistername = sistername;
        this.familymember = familymember;
        this.address = address;

    }//gett sett method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSistername() {
        return sistername;
    }

    public void setSistername(String sistername) {
        this.sistername = sistername;
    }

    public int getFamilymember() {
        return familymember;
    }

    public void setFamilymember(int familymember) {
        this.familymember = familymember;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //create object
    public Family createobject(){
        Family obj=new Family("Akash","khushi",5,"tundla");
        return obj;
    }
    //create with object
    public Family createwithparameter(String name,String sistername,int familymember,String address){
        Family obj=new Family(name,sistername,familymember,address);
        return obj;
    }

    public static void main(String[] args) {
        Family obj=new Family();
        obj=obj.createobject();
        obj.setName("Rahul");
        obj.setAddress("Nagla rati line par tundla");
        System.out.println("update name:"+obj.getName());
        System.out.println("Update address :"+obj.address);


        System.out.println("printing the  name:"+obj.name);
        System.out.println("printing the  Sister name :"+obj.sistername);
        System.out.println("printing the Familymenber :"+obj.familymember);
        System.out.println("printing the address: "+obj.address);
        obj=obj.createwithparameter("AkashSingh","Divya",6,"line par tundla firozabad");
        System.out.println("printing the  name:"+obj.name);
        System.out.println("printing the  Sister name :"+obj.sistername);
        System.out.println("printing the Familymenber :"+obj.familymember);
        System.out.println("printing the address: "+obj.address);

    }

}
