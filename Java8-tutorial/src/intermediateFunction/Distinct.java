package intermediateFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        Stream<Integer> distinctValuesStream = listInteger.stream().distinct();
        List<Integer> distinctValuesList = distinctValuesStream.collect(Collectors.toList());
        distinctValuesList.forEach(System.out::println);
    }
}
