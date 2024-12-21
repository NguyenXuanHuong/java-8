public class Main {
    public static void main(String[] args) {
        //インターフェースのインスタンスを作成する普通の方法です。
        //インターフェースを実装するクラスを作成する
        SampleFunctionalInterface sampleFunctionalInterface = new SampleFunctionalInterfaceImplementation();
        System.out.println("output from class: " + sampleFunctionalInterface.singleFunction(1));
        //機能式インターフェースのインスタンスを作成するためにラムダ式を使用する。
        SampleFunctionalInterface sampleLambdaFunction = (a) -> {return a + 1;};
        System.out.println("output from lambda: " + sampleLambdaFunction.singleFunction(1));

    }
}