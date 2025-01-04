import java.util.Optional;

public class OptionalDemonstration {
    public static void main(String[] args) {
        ClassLevel3 classLevel3 = new ClassLevel3();
        classLevel3.setLevel3Property("level3 property");
        ClassLevel2 classLevel2 = new ClassLevel2();
        classLevel2.setClassLevel3(classLevel3);
        ClassLevel1 classLevel1 = new ClassLevel1(classLevel2);
//        String classLevel3StringProperty = classLevel1.getInnerClassLevel2().getInnerClassLevel3().getLevel3Property();
//        System.out.println(classLevel3StringProperty);

        if(classLevel1.getClassLevel2()!=null){
            ClassLevel2 level2 = classLevel1.getClassLevel2();
            if(level2.getClassLevel3()!=null){
                ClassLevel3 level3 = level2.getClassLevel3();
                if(level3!=null){
                    String string = level3.getLevel3Property();
                    if(string.isEmpty()){
                        string = "Empty";
                    }
                    System.out.println(string);
                }
            }
        }
        String string = Optional.ofNullable(classLevel1.getClassLevel2()).map(ClassLevel2::getClassLevel3)
                        .map(ClassLevel3::getLevel3Property).orElse("Empty");
        System.out.println(string);
    }
}
