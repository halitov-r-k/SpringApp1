package AlishevStudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("MusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


/*

        MusicPlayer firstMusicPlayer = context.getBean("MusicPlayerBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("MusicPlayerBean", MusicPlayer.class);
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(100);

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getName());
        System.out.println(secondMusicPlayer.getVolume());
*/

        context.close();
    }
}
