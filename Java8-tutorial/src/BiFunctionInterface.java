import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {
        BiFunction<Integer, Double, String> biFunction = (inputInteger, inputDouble) -> {
            return "the input values are: " + inputInteger + " and " + inputDouble;
        };
        System.out.println(biFunction.apply(1, 2.0));
    }
}
