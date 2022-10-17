package collections;
import java.util.ArrayList;
import java.util.Objects;

public class DemoArrayList {
    public void createArray(){

        ArrayList list=new ArrayList();
        //add list
        list.add("JAVA");
        list.add("Akash");
        list.add(1);
        //readlist
        System.out.println(list.get(0));

        for(int i=0;i<list.size();i++){
            System.out.println("Printing the index:  "+list.get(i));
        }
        for (Object var:list){
            System.out.println(var);
        }



    }
    public static void main(String[] args) {
        DemoArrayList obj=new DemoArrayList();
        obj.createArray();

    }
}
