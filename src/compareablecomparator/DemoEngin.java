package compareablecomparator;

import model.Engineer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DemoEngin {
    public static void main(String[] args) {
        ArrayList<Engineer> engineers=new ArrayList<>();
        engineers.add(new Engineer("Akash","7017855964",12));
        engineers.add(new Engineer("kumar","7017855964",13));
        engineers.add(new Engineer("rahul","7017855964",14));

       //\ System.out.println(engineers);
       // Collections.sort(engineers);
//        Collections.sort(engineers,new IdCompartor());
//        System.out.println("Comparator: "+engineers);
//        ArrayList<Engineer> engineers1=new ArrayList<>();
//        Collections.sort(engineers1,new NameComparator());
//        System.out.println(engineers1);
        ArrayList<Engineer> engineers2=new ArrayList<>();
        Collections.sort(engineers2,new PhoneComparator());
        System.out.println(engineers2);




    }


}
