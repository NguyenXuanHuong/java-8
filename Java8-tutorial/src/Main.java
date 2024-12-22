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

        int inputValue = 1;
        /*
        * increase.accept(inputValue);
        * multiplyBy2.accept(inputValue);
        * */
        Consumer<Integer> theNewTwoSequenceConsumer = increase.andThen(multiplyBy2);
        System.out.println();
        System.out.println("------start executing the sequence of two lambda--------");
        theNewTwoSequenceConsumer.accept(inputValue);

        /*
         * increase.accept(inputValue);
         * multiplyBy2.accept(inputValue);
         * multiplyBy3.accept(inputValue);
         * */
        Consumer<Integer> theNewThreeSequenceConsumer = increase.andThen(multiplyBy2).andThen(multiplyBy3);
        System.out.println();
        System.out.println("------start executing the sequence of two lambda--------");
        theNewThreeSequenceConsumer.accept(inputValue);
    }
}