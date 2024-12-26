package contructorMethodReference;


public class ConstructorMethodReference {
    public static void main(String[] args) {
        SampleFunctionalInterface normalSyntax = input -> {
            return new ClassTobeConstructed(input);
        };

        SampleFunctionalInterface constructorSyntax = ClassTobeConstructed::new;
        ClassTobeConstructed classTobeConstructed = constructorSyntax.objectConstructor(1);
        System.out.println(classTobeConstructed.variable);
    }
}
