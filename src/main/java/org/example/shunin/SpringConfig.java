package org.example.shunin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.shunin")
public class SpringConfig {

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer();
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
