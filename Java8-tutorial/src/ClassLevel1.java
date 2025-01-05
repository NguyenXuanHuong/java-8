public class ClassLevel1 {
    private ClassLevel2 classLevel2;
    private Integer value;

    public ClassLevel1(ClassLevel2 classLevel2) {
        this.classLevel2 = classLevel2;
    }

    public ClassLevel1(Integer value) {
        this.value = value;
    }

    public ClassLevel2 getClassLevel2() {
        return classLevel2;
    }

    public void setClassLevel2(ClassLevel2 classLevel2) {
        this.classLevel2 = classLevel2;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
