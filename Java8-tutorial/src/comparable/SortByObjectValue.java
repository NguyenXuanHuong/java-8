package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortByObjectValue {
    public static void main(String[] args) {
        SampleComparable obj1 = new SampleComparable("obj1", 1);
        SampleComparable obj2 = new SampleComparable("obj2", 2);
        SampleComparable obj3 = new SampleComparable("obj3", 3);
        List<SampleComparable> unOrderedList = new ArrayList<>(List.of(obj2, obj1,obj3));
        System.out.println(unOrderedList);
        Collections.sort(unOrderedList);
        System.out.println(unOrderedList);
    }
}
