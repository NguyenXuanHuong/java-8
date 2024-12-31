import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        List<Integer> distinctValues = listInteger.stream().distinct().collect(Collectors.toList());
        distinctValues.forEach(System.out::println);
    }
}
