import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 7, 9, 11);
        Optional<Integer> answer = list.stream().findFirst();
        System.out.println(answer.get());
    }
}
