package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //если мы помечаем класс этой аннотацией, то спринг создаст нам бины этих классов, а значит и объекты
@Scope("singleton")
//@Scope("prototype")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
