package hashmap;
import java.util.HashMap;
import java.util.Set;

public class demo2hasmap {
    public HashMap<Integer,String> createdemo2(){
        HashMap<Integer,String> hashMap=new HashMap<>();
        //adding object
        hashMap.put(1,"rahul");
        hashMap.put(2,"akash");
        hashMap.put(3,"singh");
        hashMap.put(4,"kumar");

        return hashMap;
        //reading value from the key:::get(keys)
       // System.out.println(hashMap.get(1)+hashMap.get(2)+hashMap.get(3)+hashMap.get(4));
    }
    public static void main(String[] args) {
        demo2hasmap obj=new demo2hasmap();
        HashMap<Integer,String> hashMap= obj.createdemo2();
        hashMap.put(3,"nishu");
        for(Integer var:hashMap.keySet()){
            System.out.println("Printing the name: "+hashMap.get(var));
        }
    }

}
