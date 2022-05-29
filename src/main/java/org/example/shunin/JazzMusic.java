package org.example.shunin;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music{
    @Override
    public List<String > getSong() {
        List<String> listOfSong = new ArrayList<>();
        listOfSong.add("Jazz_1");
        listOfSong.add("Jazz_2");
        listOfSong.add("Jazz_3");

        return listOfSong;
    }
}
