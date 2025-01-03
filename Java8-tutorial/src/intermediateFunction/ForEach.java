package intermediateFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        List<Integer> plus1List = new ArrayList<>();
        Consumer<Integer> plus1ToElement = input -> {
            input++;
            plus1List.add(input);
        };
        listInteger.stream().forEach(plus1ToElement);
        plus1List.forEach(System.out::println);
    }

}
