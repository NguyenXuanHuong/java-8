import java.util.function.Predicate;

public class PredicateIsEqualMethod {
    public static void main(String[] args) {
       Predicate<Integer> isEqualTo3Predicate = Predicate.isEqual(3);
       System.out.println(isEqualTo3Predicate.test(3));
       System.out.println(isEqualTo3Predicate.test(4));
    }
}
