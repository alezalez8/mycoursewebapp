package org.example.shunin;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
  //  private Music music;
    private int volume;
    private String name;
    private List<Music> musicList = new ArrayList<>();

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

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }



    public void playMusic() {
        for (Music music: musicList
             ) {
            System.out.println(music.getSong());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.out.println("Playing: " + music.getSong());
    }


}
