package AlishevStudy;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyDestroy() {
        System.out.println("Do my initialization");
    }
    @PreDestroy
    public void doDestroy() {
        System.out.println("Do my destroy");
    }

    @Override
    public String getSong() {
        return "Classical Music Song";
    }
}
