package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic musicPlayer1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic musicPlayer2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(musicPlayer1==musicPlayer2);
    }
}
/*Algorithm
1. create a property for musicPlayer
2. add the notation to the fields: @Value("${musicPlayer.name}")
 */