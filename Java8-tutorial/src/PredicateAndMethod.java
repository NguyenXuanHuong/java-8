import java.util.Objects;
import java.util.function.Predicate;

public class PredicateAndMethod {
    public static void main(String[] args) {
        Predicate<String> containsLetterA = p -> p.contains("A");
        Predicate<String> hasLengthOf3 = p -> p.length() == 3;

        String stringContainAAndLengthIs3 = "Abc";

        /*
        containsLetterA.test(containsLetterA) && hasLengthOf3.test(containsLetterA)
        * */
        Predicate<String> stringContainAAndLengthIs3Predicate = containsLetterA.and(hasLengthOf3);
        boolean trueValue = stringContainAAndLengthIs3Predicate.test(stringContainAAndLengthIs3);
        System.out.println(trueValue);

        String lengthGreaterThan3 = "Abcd";
        boolean falseValue = stringContainAAndLengthIs3Predicate.test(lengthGreaterThan3);
        System.out.println(falseValue);
    }
}
