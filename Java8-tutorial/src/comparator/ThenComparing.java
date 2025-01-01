package comparator;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThenComparing {
    public static void main(String[] args) {
        Comparator<SampleClass> comparatorValue1 = (obj1, obj2) -> obj2.getObjectValue1() - obj1.getObjectValue1();
        Comparator<SampleClass> comparatorValue2 = (obj1, obj2) -> obj2.getObjectValue2() - obj1.getObjectValue2();
        Comparator<SampleClass> comparator = comparatorValue1.thenComparing(comparatorValue2);
        SampleClass obj1 = new SampleClass("obj1", 1, 1);
        SampleClass obj2 = new SampleClass("obj2", 1,2);
        SampleClass obj3 = new SampleClass("obj3", 3);
        List<SampleClass> unSortedList = new ArrayList<>(List.of(obj2, obj3, obj1));
        System.out.println(unSortedList);
        unSortedList.sort(comparator);
        System.out.println(unSortedList);
    }

}
