package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        /* Сейас будет проверка Singleton'a */

        boolean comparison = firstPlayer == secondPlayer;
        System.out.println(comparison);
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);

        firstPlayer.setVolume(10);
        System.out.println(firstPlayer.getVolume());
        System.out.println(secondPlayer.getVolume());

        firstPlayer.playMusic();
        System.out.println(firstPlayer.getName());
        System.out.println(firstPlayer.getVolume());

        context.close();
    }
}
