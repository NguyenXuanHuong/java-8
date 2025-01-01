package comparator;

public class SampleClass {
    private String objectName;
    private int objectValue1;
    private int objectValue2;

    public int getObjectValue2() {
        return objectValue2;
    }

    public void setObjectValue2(int objectValue2) {
        this.objectValue2 = objectValue2;
    }

    public SampleClass(String objectName, int objectValue1, int objectValue2) {
        this.objectName = objectName;
        this.objectValue1 = objectValue1;
        this.objectValue2 = objectValue2;
    }

    public SampleClass(String objectName, int objectValue1) {
        this.objectName = objectName;
        this.objectValue1 = objectValue1;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public int getObjectValue1() {
        return objectValue1;
    }

    public void setObjectValue1(int objectValue1) {
        this.objectValue1 = objectValue1;
    }

    @Override
    public String toString() {
        return "SampleClass{" +
                "objectName='" + objectName + '\'' +
                ", objectValue=" + objectValue1 +
                '}';
    }
}
