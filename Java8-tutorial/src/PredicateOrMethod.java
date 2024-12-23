import java.util.function.Predicate;

public class PredicateOrMethod {
    public static void main(String[] args) {
        Predicate<Integer> greaterThan1 = input -> input > 1;
        Predicate<Integer> greaterThan2 = input -> input > 2;
        Predicate<Integer> greaterThan3 = input -> input > 3;

        int trueInput = 2;
        int falseInput = 0;
        /*
        greaterThan1.test(input) || greaterThan2.test(containsLetterA) || greaterThan3.test(input)
        * */
        Predicate<Integer> sequencePredicate = greaterThan1.or(greaterThan2).or(greaterThan3);
        boolean trueValue = sequencePredicate.test(trueInput);
        System.out.println(trueValue);

        boolean falseValue = sequencePredicate.test(falseInput);
        System.out.println(falseValue);
    }
}
