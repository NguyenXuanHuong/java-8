import java.util.function.Function;

public class ApplySample {
    public static void main(String args[])
    {
        Function<Integer, String> createStringFromInteger = intInput -> {
            String output = "input number is: " + intInput;
            return output;
        };
        System.out.println(createStringFromInteger.apply(10));
    }
}
