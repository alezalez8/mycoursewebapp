package org.example.shunin;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public List<String > getSong() {
        List<String> listOfSong = new ArrayList<>();
        listOfSong.add("Rock_1");
        listOfSong.add("Rock_2");
        listOfSong.add("Rock_3");

        return listOfSong;
    }
}
