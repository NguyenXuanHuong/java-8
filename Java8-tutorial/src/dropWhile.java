import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dropWhile {
    public static void main(String[] args) {
        Stream<Integer> stream
                = Stream.of(2, 3, 4, 5, 1, 4, 4, 8, 9, 10);

        // apply dropWhile to drop all the numbers
        // matches passed predicate
        List<Integer> list
                = stream.dropWhile(number -> (number > 1))
                .collect(Collectors.toList());

        // print list
        System.out.println(list);
    }
}
