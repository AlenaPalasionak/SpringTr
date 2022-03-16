package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //init-method будет вызван здесь, до создания объекта
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
//
//        MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        /* Сейас будет проверка Singleton'a */
//
//        boolean comparison = firstPlayer == secondPlayer;
//        System.out.println(comparison);
//        System.out.println(firstPlayer);
//        System.out.println(secondPlayer);
//
//        firstPlayer.setVolume(10);
//        System.out.println(firstPlayer.getVolume());
//        System.out.println(secondPlayer.getVolume());
//
//        firstPlayer.playMusic();
//        System.out.println(firstPlayer.getName());
//        System.out.println(firstPlayer.getVolume());

        //когда метод мэйн завершится - будет вызван destroy-method
        System.out.println("контекст еще не закрыт");
        context.close();// а потом закрыт контекст

    }
}
