package objectMethodReference;

import staticMethodReference.SampleFunctionalInterface;

public class ObjectMethodReference {
    public static void main(String[] args) {
        DivideMethodClass divideMethodClass = new DivideMethodClass();
        SampleFunctionalInterface normalSyntax = (input1, input2) -> {
            return divideMethodClass.divideFunction(input1, input2);
        };
        SampleFunctionalInterface methodReferenceSyntax = divideMethodClass::divideFunction;
        System.out.println(methodReferenceSyntax.divideValue(1,2));
    }
}
