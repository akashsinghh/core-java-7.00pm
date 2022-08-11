package Array;
import java.util.*;

import java.util.ArrayList;

public class Collection {
    public void displaywithgenerics(){
        ArrayList<Integer> generic_list=new ArrayList<Integer>();
        generic_list.add(2);
        generic_list.add(3);
        generic_list.add(4);
        for (Object var:generic_list){
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        Collection obj=new Collection();
       // obj.display();
        obj.displaywithgenerics();
    }
}
