package AlishevStudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("MusicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
