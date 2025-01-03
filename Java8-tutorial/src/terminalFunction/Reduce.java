package terminalFunction;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);

        // first round: input1 = 1, input2 = 2 -> result1 = input2 = 2
        // second round; input1 = result1 = 2, input2 = 3 -> result = input2 = 3;
        // final result = 3
        BinaryOperator<Integer> findMaxValue = (input1, input2) -> input2 > input1? input2 : input1;
        Optional<Integer> maxValueOptional = list.stream().reduce(findMaxValue);
        maxValueOptional.ifPresent(System.out::println);

        // first round: input1 = 0, input2 = 1            -> result1 = input1 + input2 = 1
        // second round; input1 = result1 = 1, input2 = 2 -> result2 = input1 + input2 = 3;
        // third round; input1 = result2 = 3, input2 = 3  -> result3 = input1 + input2 = 6;
        // final result = result3 = 6
        BinaryOperator<Integer> findSumValue = (input1, input2) -> input2 + input1;
        Integer sumValueOptional = list.stream().reduce(0, findSumValue);
        System.out.println(sumValueOptional);


    }
}
