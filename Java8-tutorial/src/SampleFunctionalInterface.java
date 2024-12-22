@FunctionalInterface
public interface SampleFunctionalInterface {
    int theOnlyAbstractMethod(int input);
//    int cannotHaveTheSecondAbstractMethod(int input)
    default int theFirstDefaultMethod(){
        return 1;
    }
    default  int theSecondDefaultMethod(){
        return 2;
    }
    static int theFirstStaticMethod(){
        return 1;
    }
    static int theSecondStaticMethod(){
        return 2;
    }
}
