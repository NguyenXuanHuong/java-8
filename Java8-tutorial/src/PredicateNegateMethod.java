import java.util.function.Predicate;

public class PredicateNegateMethod {
    public static void main(String[] args) {
        Predicate<String> containsLetterAPredicate = p -> p.contains("A");
        String notContainA = "bcd";
        Predicate<String> notContainsLetterAPredicate = containsLetterAPredicate.negate();
        boolean trueValue = notContainsLetterAPredicate.test(notContainA);
        System.out.println(trueValue);
    }
}
