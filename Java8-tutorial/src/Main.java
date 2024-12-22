import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
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

        Consumer<Integer> multiplyBy2 = input -> {
            System.out.println("original input value is: " + input);
            input = input * 2;
            System.out.println("multiplyBy2 lambda: accept method was executed");
            System.out.println("updated input value is: " + input);
            System.out.println("---------------end---------------");
        };

        Consumer<Integer> multiplyBy3 = input -> {
            System.out.println("original input value is: " + input);
            input = input * 3;
            System.out.println("multiplyBy3 lambda: accept method was executed");
            System.out.println("updated input value is: " + input);
            System.out.println("---------------end---------------");
        };

        // using addThen()
        Consumer<Integer> theNewSequenceConsumer = increase.andThen(multiplyBy2).andThen(multiplyBy3);
        System.out.println();
        System.out.println("------start executing the sequence of three lambda--------");
        theNewSequenceConsumer.accept(inputValue);
    }
}