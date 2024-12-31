import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Stream<Integer> streamInteger = Stream.of(1,2,3);

        BinaryOperator<Integer> findMaxValue = (input1, input2) -> input2 > input1? input2 : input1;
        Optional<Integer> maxValueOptional = streamInteger.reduce(findMaxValue);
        maxValueOptional.ifPresent(System.out::println);

        Stream<Integer> streamInteger2 = Stream.of(1,2,3);
        BinaryOperator<Integer> findSumValue = (input1, input2) -> input2 + input1;
        Integer sumValueOptional = streamInteger2.reduce(0, findSumValue);
        System.out.println(sumValueOptional);


    }
}
