package compareablecomparator;

import model.Engineer;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class IdCompartor implements Comparator<Engineer> {
    @Override
    public int compare(Engineer o1, Engineer o2) {
        return o1.getEngid()-o2.getEngid();
    }


}
