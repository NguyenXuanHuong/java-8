import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        Predicate<Integer> searchCondition = input -> input > 1;
        boolean listContainElementGreaterThan2 = listInteger.stream().anyMatch(searchCondition);
        System.out.println(listContainElementGreaterThan2);
    }
}
