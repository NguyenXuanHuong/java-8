import java.util.function.Predicate;

public class PredicateNotMethod {
    public static void main(String[] args) {
        Predicate<Integer> isEqual3 = input -> input == 3;
        Predicate<Integer> notEqual3 = Predicate.not(isEqual3);
        System.out.println(notEqual3.test(3));
    }
}
