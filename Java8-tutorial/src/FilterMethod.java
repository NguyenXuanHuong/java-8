import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        Predicate<Integer> greaterThan1 = input -> input > 1;
        List<Integer> elementGreaterThan1 = listInteger.stream().filter(greaterThan1).collect(Collectors.toList());
        elementGreaterThan1.forEach(System.out::println);
    }
}
