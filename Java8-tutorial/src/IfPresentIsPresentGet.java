import java.util.Optional;

public class IfPresentIsPresentGet {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.setName("name of object");
        Optional<String> nameOptional = Optional.ofNullable(sampleClass).map(SampleClass::getName);
        if(nameOptional.isPresent()){
            System.out.println(nameOptional.get());
        }
        nameOptional.ifPresent((s) -> System.out.println(s));
    }
}
