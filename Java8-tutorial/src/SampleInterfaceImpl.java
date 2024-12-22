public class SampleInterfaceImpl implements SampleFunctionalInterface{
    @Override
    public int theOnlyAbstractMethod(int input) {
        return 0;
    }
    @Override
    public int theFirstDefaultMethod() {
        return 3;
    }
    /*
    cannot override static method of interface
    @Override
    static int theFirstStaticMethod() {
        return 4;
    }
    */
}
