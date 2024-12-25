import java.util.function.Function;

public class ComposeMethod {
    public static void main(String[] args) {
        Function<Integer, Integer> plus1 = input -> {
            return input + 1;
        };
        Function<Integer, Integer> plus2 = input -> {
            return input + 2;
        };

        int plus2Result = plus2.apply(3);
        int composedResult = plus1.apply(plus2Result);
        System.out.println(composedResult);

        Function<Integer, Integer> composed = plus1.compose(plus2);
        System.out.println(composed.apply(3));
    }

}
