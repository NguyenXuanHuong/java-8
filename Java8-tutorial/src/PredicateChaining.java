import java.util.function.Predicate;

public class PredicateChaining {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        /*
        * greaterThanTen.test(15)
        * lowerThanTwenty.test(15)
        * */
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
    }

}
