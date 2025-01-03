package terminalFunction;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListCollector {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        Stream<Integer> listPlus1Stream = list.stream().map(input -> input + 1);
        List<Integer> listPlus1 = listPlus1Stream.collect(Collectors.toList());
        System.out.println(listPlus1);
    }
}
