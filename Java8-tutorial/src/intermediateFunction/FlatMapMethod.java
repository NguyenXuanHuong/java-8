package intermediateFunction;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMethod {
    public static void main(String[] args)
    {
        List<List<Integer>> listOfList = List.of(List.of(1,2), List.of(3,4), List.of(5,6));
        Stream<List<Integer>> streamOfStream = listOfList.stream();
        Function<List<Integer>, Stream<Integer>> streamInteger = list -> list.stream();
        Stream<Integer> flatStream = streamOfStream.flatMap(streamInteger);
        List<Integer> flatList = flatStream.collect(Collectors.toList());
        System.out.println(flatList);
    }
}
