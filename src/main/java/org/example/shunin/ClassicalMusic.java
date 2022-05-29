package org.example.shunin;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component()
public class ClassicalMusic implements Music{

    @Value("${musicPlayer.volume}")
    private int volume;

    @Value("${musicPlayer.name}")
    private String name;

    private ClassicalMusic() {

    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<String > getSong() {
        List<String> listOfSong = new ArrayList<>();
        listOfSong.add("Classic_1");
        listOfSong.add("Classic_2");
        listOfSong.add("Classic_3");

        return listOfSong;

    }
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my init");
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destraction");

    }


}
