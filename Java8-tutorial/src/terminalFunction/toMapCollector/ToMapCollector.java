package terminalFunction.toMapCollector;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapCollector {
    public static void main(String[] args) {
        SampleObject obj1 = new SampleObject("obj1", 1);
        SampleObject obj2 = new SampleObject("obj2", 2);
        SampleObject obj3 = new SampleObject("obj3", 3);
        List<SampleObject> list = List.of(obj1, obj2, obj3);
        Stream<SampleObject> stream = list.stream();
        Function<SampleObject, String> getObjName = obj -> obj.objectName;
        Function<SampleObject, Integer> getObjValue = obj -> obj.objectValue;
        Map<String, Integer> map = stream.collect(Collectors.toMap(getObjName, getObjValue));
        System.out.println(map);
    }
}
