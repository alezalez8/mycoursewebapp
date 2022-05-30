package org.example.shunin;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example.shunin")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

/*
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
*/
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }


/*
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), rockMusic());
    }
*/

/*
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
*/

}
