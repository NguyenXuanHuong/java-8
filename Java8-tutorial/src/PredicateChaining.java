import java.util.ArrayList;
import java.util.List;

public class PredicateChaining {
    public static void main(String[] args) {
        //インターフェスのインスタンスを作成するための一般的な方法
        //実装クラスからインスタンスを作成する
        SampleFunctionalInterface theInstanceCreatedFromClass = new SampleFunctionalInterfaceImpl();
        passLambdaToMethod(theInstanceCreatedFromClass);

        //ラムダ式を使用して、機能式インターフェスのインスタンスを作成する。
        SampleFunctionalInterface lambda = () -> {
            System.out.println();
            System.out.println("using lambda function to create functional interface instance");
        };
        passLambdaToMethod(lambda);
        /*passLambdaToMethod(
                () -> {
            System.out.println();
            System.out.println("using lambda function to create functional interface instance");
            }
        );*/
//        List<Integer> list = new ArrayList<>();
//        list.forEach();
    }

    static void passLambdaToMethod(SampleFunctionalInterface sampleFunctionalInterface){
        sampleFunctionalInterface.singleAbstractMethod();
    }

}
