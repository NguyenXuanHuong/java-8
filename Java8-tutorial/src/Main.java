public class Main {
    public static void main(String[] args) {
        // パラメーターなし
        NoParameter noParameter = () -> {
            System.out.println("implementation of the noParamMethod inside the interface");
        };
        noParameter.noParamMethod();

        //単一パラメータ
        SingleParam singleParam = (input) -> {
            int input1 = input + 1;
            System.out.println("increased the input");
            return input1;
        };
        System.out.println("singleParam method result: " + singleParam.singleParamMethod(1));

        //複数パラメーター
        MultipleParams multipleParams = (input1, input2) -> input1 + input2 + 1;
        System.out.println("multiParam method result: " + multipleParams.multiParamsMethod(1,2));

    }
}