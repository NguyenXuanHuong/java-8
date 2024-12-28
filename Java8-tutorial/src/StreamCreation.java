import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Stream<Integer> streamObject = list.stream();
        streamObject.forEach(System.out::println);
    }
}
