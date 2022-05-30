package org.example.shunin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private int volume;
    private String name;
    TypeOfMusic typeOfMusic;


    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public MusicPlayer() {
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String playMusic(TypeOfMusic typeOfMusic) {
        Random random = new Random();
        int numberOfSong = random.nextInt(3);
        String currentPlay;
        if (typeOfMusic == TypeOfMusic.CLASSICAL) {
            currentPlay = music1.getSong().get(numberOfSong);

        } else {
            currentPlay = music2.getSong().get(numberOfSong);
        }

       // return "Playing: " + music1.getSong() + " ,  " + music2.getSong();
        return "Playing:  " + currentPlay ;

    }
}



