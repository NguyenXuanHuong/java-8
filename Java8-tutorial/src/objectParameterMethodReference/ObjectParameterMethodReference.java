package objectParameterMethodReference;

public class ObjectParameterMethodReference {
    public static void main(String[] args) {
        SampleFunctionalInterface normalSyntax = (divideMethodObject, input) -> {
            return divideMethodObject.divideFunction(input);
        };

        SampleFunctionalInterface objectParamMethodReference = DivideMethodClass::divideFunction;
        DivideMethodClass divideMethodObject = new DivideMethodClass();
        System.out.println(objectParamMethodReference.divideValue(divideMethodObject, 1));

    }
}
