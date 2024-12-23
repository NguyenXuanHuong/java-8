import java.util.function.Predicate;

public class PredicateIsEqualMethod {
    public static void main(String[] args) {
        Predicate<Integer> isEqualTo3 = (input) -> input == 3;
        boolean trueValue = isEqualTo3.test(3);
        System.out.println(trueValue);
    }
}
