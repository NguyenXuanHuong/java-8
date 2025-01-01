package terminalFunction.groupbyCollector;

public class SampleObject {
    public String objectName;
    public int objectValue;

    public SampleObject(String objectName, int objectValue) {
        this.objectName = objectName;
        this.objectValue = objectValue;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "SampleObject{" +
                "objectName='" + objectName + '\'' +
                ", objectValue=" + objectValue +
                '}';
    }

    public int getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(int objectValue) {
        this.objectValue = objectValue;
    }
}
