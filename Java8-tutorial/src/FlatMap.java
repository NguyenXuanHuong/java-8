import java.util.Optional;

public class FlatMap {
    public static void main(String[] args) {
        SampleClass2 sampleClass2 = new SampleClass2("name of class2");
        SampleClass1 sampleClass1 = new SampleClass1(Optional.of(sampleClass2));
        Optional<Optional<SampleClass2>> nestedOptional = Optional.of(sampleClass1)
                .map(class1 -> class1.getSampleClass2Optional());
        Optional<SampleClass2> flatMap = Optional.of(sampleClass1).flatMap(class1 -> class1.getSampleClass2Optional());
        String name = flatMap.map(class2 -> class2.getName()).orElse("default name");
        System.out.println(name);
    }
}
