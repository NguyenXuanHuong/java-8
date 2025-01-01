package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorClass {
    public static void main(String[] args) {

        Comparator<SampleClass> comparator = (obj1, obj2) -> obj2.getObjectValue1() - obj1.getObjectValue1();
        SampleClass obj1 = new SampleClass("obj1", 1);
        SampleClass obj2 = new SampleClass("obj2", 2);
        SampleClass obj3 = new SampleClass("obj3", 3);
        List<SampleClass> unSortedList = new ArrayList<>(List.of(obj2, obj3, obj1));
        System.out.println(unSortedList);
        unSortedList.sort(comparator);
        System.out.println(unSortedList);

    }
}
