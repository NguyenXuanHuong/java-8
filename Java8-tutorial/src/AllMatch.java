import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        Predicate<Integer> searchCondition = input -> input > 1;
        boolean listHaveAllElementGreaterThan2 = listInteger.stream().allMatch(searchCondition);
        System.out.println(listHaveAllElementGreaterThan2);
    }
}
