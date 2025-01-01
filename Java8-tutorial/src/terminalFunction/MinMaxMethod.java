package terminalFunction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxMethod {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,4,2,5,6);
        Comparator<Integer> comparator = (input1, input2) -> input1 - input2;
        Integer min = list.stream().min(comparator).get();
        Integer max = list.stream().max(comparator).get();

        System.out.println(min);
        System.out.println(max);
    }
}
