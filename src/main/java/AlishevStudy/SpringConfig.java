package AlishevStudy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("AlishevStudy")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
