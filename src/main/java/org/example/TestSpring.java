package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic music1 = context.getBean("classicalMusic", ClassicalMusic.class);
    }
}
/* алгоритм:
1. Создаем класс SpringConfig
2. Помечаем его аннотациями:
@Configuration - этот класс будеть конфигурационным(т.е. содержать нужную информацию для спринга)
@ComponentScan("org.example") - путь где искать компоненты, чтобы искать бины для этих компонентов
@PropertySource("classpath:musicPlayer.properties") - путь до файла со значениями для полей
3. AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); - в main
 */