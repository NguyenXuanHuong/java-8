import java.util.Optional;

public class OptionalOfOfNullableEmpty {
    public static void main(String[] args) {

        SampleClass sampleClass = new SampleClass();

        Optional<SampleClass> sampleClassOfNullable = Optional.ofNullable(sampleClass);
        String name = sampleClassOfNullable.map(SampleClass::getName).orElse("ofNullable");

        Optional<SampleClass> sampleClassOf = Optional.of(sampleClass);
        String name2 = sampleClassOf.map(SampleClass::getName).orElse("Of");

//        SampleClass sampleClassNull = null;
//        Optional<SampleClass> sampleClassOfNullable = Optional.ofNullable(sampleClassNull);
//        String name = sampleClassOfNullable.map(SampleClass::getName).orElse("ofNullable");
//
//        Optional<SampleClass> sampleClassOf = Optional.of(sampleClassNull);
//        String name2 = sampleClassOfNullable.map(SampleClass::getName).orElse("Of");

//        Optional<Integer> empty = Optional.empty();
//        System.out.println(empty.get());

        System.out.println(name);
        System.out.println(name2);
    }
}
