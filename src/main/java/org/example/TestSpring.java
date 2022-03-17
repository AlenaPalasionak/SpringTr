package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer2.playMusic();

        context.close();
    }
}
/*
Algorithm:
1. <context:component-scan base-package="org.example"/> in applicationContecst
2. mark the classes with annotation to say spring that it should create beans
3. ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"); - open the Bean container
4. Music music = context.getBean("rockMusic", Music.class); - get the Bean
5. MusicPlayer musicPlayer = new MusicPlayer(music); ctreate the object and put the beanObject into a parameters
6.use the method of the object
 */
