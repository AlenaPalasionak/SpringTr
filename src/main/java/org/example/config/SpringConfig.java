package org.example.config;

import org.example.Computer;
import org.example.Music;
import org.example.MusicPlayer;
import org.example.genres.ClassicalMusic;
import org.example.genres.JazzMusic;
import org.example.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable).
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
        /*This method also provides a convenient way to create a
        fixed-size list initialized to contain several elements:
        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");*/
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}