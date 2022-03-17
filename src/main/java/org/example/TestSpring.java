package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
musicPlayer.playMusic();

        /* Algorithm
        1.сканируются все классы с аннотацией @Component - созд. бины
        2. спринг проверяет подходят ли бины в качестве зависимости там, где мы указали @Autowired
         */

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer2.playMusic();
//
//        context.close();
    }
}
