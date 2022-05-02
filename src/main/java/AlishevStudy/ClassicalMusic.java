package AlishevStudy;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Get Classical Music");
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Do my initialization");
    }
    public void doDestroy() {
        System.out.println("Do my destroy");
    }

    @Override
    public String getSong() {
        return "Classical Music Song";
    }
}
