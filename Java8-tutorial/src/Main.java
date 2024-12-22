import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // Consumer to increase the input
        Consumer<Integer> increase = input ->
        {
            System.out.println("original input value is: " + input);
            input++;
            System.out.println("increase lambda: accept method was executed");
            System.out.println("updated input value is: " + input);
            System.out.println("---------------end---------------");
        };
        int inputValue = 1;
        increase.accept(inputValue);

        // Consumer to multiply the input
        Consumer<Integer> multiply = input -> {
            System.out.println("original input value is: " + input);
            input = input * 2;
            System.out.println("multiply lambda: accept method was executed");
            System.out.println("updated input value is: " + input);
            System.out.println("---------------end---------------");
        };
        // using addThen()
        Consumer<Integer> theNewSequenceConsumer = increase.andThen(multiply);
        System.out.println();
        System.out.println("------start executing the sequence of two lambda--------");
        theNewSequenceConsumer.accept(inputValue);
    }
}