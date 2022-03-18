package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//этот класс будеть конфигурационным
@PropertySource("classpath:musicPlayer.properties")//путь до файла со значениями для полей
public class SpringConfig {
}
