package terminalFunction.groupbyCollector;



import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByCollector {
    public static void main(String[] args) {
        SampleObject obj1 = new SampleObject("A" , 1);
        SampleObject obj2 = new SampleObject("A" , 2);
        SampleObject obj3 = new SampleObject("B" , 3);
        SampleObject obj4 = new SampleObject("B" , 4);
        SampleObject obj5 = new SampleObject("B" , 5);
        SampleObject obj6 = new SampleObject("C" , 6);
        List<SampleObject> list = List.of(obj1, obj2, obj3, obj4, obj5, obj6);
        Function<SampleObject, String> groupByKey = SampleObject::getObjectName;

        Map<String, List<SampleObject>> singleParamMap = list.stream().collect(Collectors.groupingBy(groupByKey));
        System.out.println(singleParamMap);
//        singleParamMapList.collect(Collectors.counting())
        Map<String, Long> twoParamMap = list.stream().collect(Collectors.groupingBy(groupByKey, Collectors.counting()));
        System.out.println(twoParamMap);
    }
}
