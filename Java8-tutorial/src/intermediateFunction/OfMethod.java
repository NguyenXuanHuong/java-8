package intermediateFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OfMethod {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        Stream<Integer> streamFromList = listInteger.stream();
        Stream<Integer> streamFromOfMethod = Stream.of(1,2,3);
    }
}
