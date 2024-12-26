package staticMethodReference;

public class StaticMethodReference {
    public static void main(String[] args) {
        SampleFunctionalInterface normalLambdaSyntax = (input1, input2) -> {
            return DivideMethodClass.staticDivideFunction(input1, input2);
        };
        SampleFunctionalInterface methodReferenceSyntax = DivideMethodClass::staticDivideFunction;

        SampleFunctionalInterface normalLambdaSyntax1 = (input1, input2) -> {
            return DivideMethodClass.staticDivideFunction(input2, input1);
        };

        System.out.println(methodReferenceSyntax.divideValue(1, 2));
    }
}
