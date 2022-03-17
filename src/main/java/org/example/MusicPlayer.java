package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired      // during the creating the player classical music and rock music classes
    // are automatically wired into the class MusicPlayer
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(Genre genre)  {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == Genre.CLASSICAL) {
            // случайная классическая песня
            System.out.println(classicalMusic.getSongs().get(randomNumber));// we get a list and  random song from the list
        } else {
            // случайная рок песня
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
}