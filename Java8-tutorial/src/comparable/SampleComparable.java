package comparable;

public class SampleComparable implements Comparable<SampleComparable>{
    private String objectName;
    private Integer objectValue;

    public SampleComparable(String objectName, Integer objectValue) {
        this.objectName = objectName;
        this.objectValue = objectValue;
    }

    @Override
    public String toString() {
        return "SampleComparable{" +
                "objectName='" + objectName + '\'' +
                ", objectValue=" + objectValue +
                '}';
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Integer getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Integer objectValue) {
        this.objectValue = objectValue;
    }

    //sort in ascend order
//    @Override
//    public int compareTo(SampleComparable o) {
//        return this.objectValue - o.getObjectValue();
//    }
    //sort in descend order
    @Override
    public int compareTo(SampleComparable o) {
        return o.getObjectValue() - this.objectValue;
    }
}
