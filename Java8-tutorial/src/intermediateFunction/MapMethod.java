package intermediateFunction;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethod {
    public static void main(String[] args) {
        List<Integer> listInteger = List.of(1,2,3);
        Function<Integer, String> mapFunction = input -> {
            return "input string: " + input;
        };
        Stream<String> stringStream = listInteger.stream().map(mapFunction);
        List<String> listString = stringStream.collect(Collectors.toList());
        System.out.println(listString);
    }
}
