package terminalFunction;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        BinaryOperator<Integer> findMaxValue = (input1, input2) -> input2 > input1? input2 : input1;
        Optional<Integer> maxValueOptional = list.stream().reduce(findMaxValue);
        maxValueOptional.ifPresent(System.out::println);

        BinaryOperator<Integer> findSumValue = (input1, input2) -> input2 + input1;
        Integer sumValueOptional = list.stream().reduce(0, findSumValue);
        System.out.println(sumValueOptional);


    }
}
