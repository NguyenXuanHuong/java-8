public class Main {
    public static void main(String[] args) {
        // 実質的にfinalな変数
        int outside = 1;
        SingleParam singleParam = (input) -> {
            //ok
            input = outside + 10;
//            outside++; できない
            System.out.println("value of input: " + input);
            return input;
        };
        singleParam.increaseOutsideVariable(10);
        System.out.println(outside);
    }
}