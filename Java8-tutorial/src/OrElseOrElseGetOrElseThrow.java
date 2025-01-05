import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class OrElseOrElseGetOrElseThrow {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.setName("name of the instance");
        String defaultOrElse = Optional.ofNullable(sampleClass).map(SampleClass::getName).orElse("Default OrElse");
        Supplier<String> getRandomString = () -> {
            Random random = new Random();
            return String.valueOf(random.nextInt(100));
        };
        String defaultOrElseGet = Optional.ofNullable(sampleClass).map(SampleClass::getName).orElseGet(getRandomString);

        System.out.println(defaultOrElse);
        System.out.println(defaultOrElseGet);
//        Supplier<RuntimeException> getRuntimeException = RuntimeException::new;
//        String runtimeException = Optional.ofNullable(sampleClass).map(SampleClass::getName).orElseThrow(getRuntimeException);
    }
}
