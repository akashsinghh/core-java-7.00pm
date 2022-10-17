package compareablecomparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demp {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(12);
        marks.add(1);
        marks.add(12);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
    }
}
