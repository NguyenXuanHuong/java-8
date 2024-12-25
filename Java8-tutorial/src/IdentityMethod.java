import java.util.function.Function;

public class IdentityMethod {
    public static void main(String[] args)
    {
        Function<Integer, Integer> i = Function.identity();
        System.out.println(i.apply(10));
    }
}
