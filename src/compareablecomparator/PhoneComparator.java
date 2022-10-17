package compareablecomparator;

import model.Engineer;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Engineer> {
    @Override
    public int compare(Engineer o1, Engineer o2) {
        return o1.getPhone().compareTo(o2.getPhone());
    }
}
