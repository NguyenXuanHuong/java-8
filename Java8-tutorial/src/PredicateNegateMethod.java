import java.util.function.Predicate;

public class PredicateNegateMethod {
    public static void main(String[] args) {
        Predicate<Integer> greaterThan2 = input -> input > 2;
        Predicate<Integer> lessThan2 = input -> input < 2;
        int input = 1;
        Predicate<Integer> greaterThan2Negate = greaterThan2.negate();
        boolean trueValue = greaterThan2Negate.test(input);
        System.out.println(trueValue);
    }
}
