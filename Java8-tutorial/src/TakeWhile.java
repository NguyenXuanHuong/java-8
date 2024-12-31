import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhile {
    public static void main(String[] args) {
        Stream<Integer> stream
                = Stream.of(4, 5, 6, 3, 6, 7, 8, 9, 10);
        List<Integer> list
                = stream.takeWhile(number -> number > 3)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
