package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);//created a player

        musicPlayer.playMusic(Genre.CLASSICAL);
        musicPlayer.playMusic(Genre.ROCK);

        context.close();
    }
}