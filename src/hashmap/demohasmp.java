package hashmap;

import java.util.HashMap;
import java.util.Set;

public class demohasmp {
    public void createhasmap(){
        //Syntax: Hasmap <Datatype_key,Datatype_value> objectname=new hashmap<>
        HashMap<Integer,String> hashMap=new HashMap<>();
        //adding value to map : this are the special function so we add these fxn with the help of PUT(key,value)
        hashMap.put(1,"JAVA");
        hashMap.put(2,"Spring");
        hashMap.put(3,"Boot");

        //reading value from the map:Key :::get(keys)
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
        System.out.println("previos :" +hashMap.get(3));
        // we do not have duplicay keys: if we add any duplicate key then it well override perevios value
        hashMap.put(3,"Python");
        System.out.println("override: "+hashMap.get(3));

        //printing entire hashmap : keySet(); :it return set of key
        Set<Integer> keys=hashMap.keySet();
        for(Integer var : hashMap.keySet()){
            System.out.println(hashMap.get(var));
        }
//        for (Integer var:keys) {
//            System.out.println();
//
//        }
    }
    public static void main(String[] args) {
        demohasmp obj=new demohasmp();
        obj.createhasmap();
    }

}
