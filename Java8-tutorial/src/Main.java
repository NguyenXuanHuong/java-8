import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> plusTwoInput = (int1, int2) -> {
            int sum = int1 + int2;
            System.out.println("plusTwoInput lambda: accept method was executed");
            System.out.println("summarized value is: " + sum);
            System.out.println("---------------end---------------");
        };

        BiConsumer<Integer, Integer> multiplyTwoInput = (int1, int2) -> {
            int multi = int1 * int2;
            System.out.println("multiplyTwoInput lambda: accept method was executed");
            System.out.println("multiple value is: " + multi);
            System.out.println("---------------end---------------");
        };

        int input1 = 1;
        int input2 = 2;

        plusTwoInput.accept(input1, input2);

        /*
        * plusTwoInput.accept(inputValue);
        * multiplyTwoInput.accept(inputValue);
        * */
        BiConsumer<Integer, Integer> theNewTwoSequenceConsumer = plusTwoInput.andThen(multiplyTwoInput);
        System.out.println();
        System.out.println("------start executing the sequence of two lambda--------");
        theNewTwoSequenceConsumer.accept(input1, input2);
    }
}