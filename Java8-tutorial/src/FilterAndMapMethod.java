import java.util.Optional;

public class FilterAndMapMethod {
    public static void main(String[] args) {
        ClassLevel3 classLevel3 = new ClassLevel3("level 3 string");
        ClassLevel2 classLevel2 = new ClassLevel2(classLevel3);
        ClassLevel1 classLevel1 = new ClassLevel1(classLevel2);
        Optional<String> level3StringOptional = Optional.of(classLevel1).map(level1 -> level1.getClassLevel2())
                .map(leve2 -> leve2.getClassLevel3()).map(level3 -> level3.getStringValue());
        level3StringOptional.ifPresent(System.out::println);

        ClassLevel1 failedPredicate = new ClassLevel1(2);
        Optional<ClassLevel1> optionalClassLevel1 = Optional.of(failedPredicate).filter((obj) -> {return obj.getValue() > 3;});
        System.out.println(optionalClassLevel1.isPresent());
    }
}
