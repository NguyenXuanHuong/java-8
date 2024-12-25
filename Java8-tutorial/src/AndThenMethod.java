import java.util.function.Function;

public class AndThenMethod {
    public static void main(String[] args) {
        Function<Integer, Integer> plus1 = input -> {
            return input + 1;
        };
        Function<Integer, Integer> multiple2 = input -> {
            return input * 2;
        };
        int plus1Result = plus1.apply(4);
        int plus2Result = multiple2.apply(plus1Result);
        System.out.println(plus2Result);

        Function<Integer, Integer> sequenceFunction = plus1.andThen(multiple2);
        System.out.println(sequenceFunction.apply(4));
    }

}
