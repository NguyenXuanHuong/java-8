import java.util.Optional;

public class SampleClass1 {
    private Optional<SampleClass2> sampleClass2Optional;

    public SampleClass1(Optional<SampleClass2> sampleClass2Optional) {
        this.sampleClass2Optional = sampleClass2Optional;
    }

    public Optional<SampleClass2> getSampleClass2Optional() {
        return sampleClass2Optional;
    }

    public void setSampleClass2Optional(Optional<SampleClass2> sampleClass2Optional) {
        this.sampleClass2Optional = sampleClass2Optional;
    }
}
