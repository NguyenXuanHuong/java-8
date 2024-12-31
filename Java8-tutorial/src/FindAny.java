import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        Optional<Integer> anyRandomValueOfList = listInteger.stream().findAny();
        anyRandomValueOfList.ifPresent(System.out::println);
    }
}
