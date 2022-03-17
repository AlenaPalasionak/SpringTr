package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component //если мы помечаем класс этой аннотацией, то спринг создаст нам бины этих классов, а значит и объекты
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();
    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
