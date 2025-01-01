package intermediateFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMethod {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        Predicate<Integer> greaterThan1 = input -> input > 1;
        Stream<Integer> elementGreaterThan1Stream = listInteger.stream().filter(greaterThan1);
        List<Integer> elementGreaterThan1StreamList = elementGreaterThan1Stream.collect(Collectors.toList());
        elementGreaterThan1StreamList.forEach(System.out::println);
    }
}
