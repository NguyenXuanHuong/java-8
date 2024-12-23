import java.util.function.Predicate;

public class PredicateOrMethod {
    public static void main(String[] args) {
        Predicate<String> containsLetterA = p -> p.contains("A");
        Predicate<String> hasLengthOf10 = p -> p.length() == 10;
        String containsA = "And";
        String notContainsA = "Then";
        boolean trueValue = hasLengthOf10.or(containsLetterA).test(containsA);
        boolean falseValue = hasLengthOf10.or(containsLetterA).test(notContainsA);
        System.out.println(trueValue);
        System.out.println(falseValue);
    }
}
