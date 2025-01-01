package terminalFunction;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningCollector {
    public static void main(String[] args)
    {
        String string1
                = Stream.of("a", "b","c" )
                .collect(Collectors.joining());

        String string2
                = Stream.of("a", "b","c" )
                .collect(Collectors.joining("_"));

        String string3
                = Stream.of("a", "b","c" )
                .collect(Collectors.joining("_", "[", "]"));
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }
}
