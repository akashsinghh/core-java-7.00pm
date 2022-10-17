package compareablecomparator;

import model.Engineer;

import java.util.Comparator;

public class NameComparator implements Comparator<Engineer> {
    @Override
    public int compare(Engineer o1, Engineer o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
