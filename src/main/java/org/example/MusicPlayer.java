package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired //use reflection - not recommended by idea
    private Music music;


    public void playMusic()  {
        System.out.println("Playing: " + music.getSong());
    }
}
