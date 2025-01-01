package terminalFunction;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToSetCollector {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,2,2,3,3);
        Stream<Integer> listStream = list.stream();
        Set<Integer> set = listStream.collect(Collectors.toSet());
        System.out.println(set);
    }


}
