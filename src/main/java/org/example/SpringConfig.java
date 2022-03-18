package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//этот класс будеть конфигурационным
@ComponentScan("org.example")//путь где искать компоненты, чтобы искать бины для этих компонентов
@PropertySource("classpath:musicPlayer.properties")//путь до файла со значениями для полей
public class SpringConfig {
}
