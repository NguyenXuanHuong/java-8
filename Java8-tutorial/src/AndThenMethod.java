import java.util.function.Function;

public class AndThenMethod {
    public static void main(String[] args) {
        Function<Integer, String> turnIntegerToString = intInput -> {
            System.out.println("turn Integer to String");
            return String.valueOf(intInput);
        };
        Function<String, Integer> turnStringToInteger = stringInput -> {
            System.out.println("turn String back to Integer");
            return Integer.valueOf(stringInput);
        };
        Function<Integer, Integer> sequenceFunction = turnIntegerToString.andThen(turnStringToInteger);
        System.out.println(sequenceFunction.apply(10));
    }

}
