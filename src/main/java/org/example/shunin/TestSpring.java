package org.example.shunin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        ClassicalMusic music = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic music1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic music2 = context.getBean("classicalMusicBean", ClassicalMusic.class);

        System.out.println(music.getSong());


/*
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(firstMusicPlayer == secondMusicPlayer);
        System.out.println(firstMusicPlayer);
        firstMusicPlayer.setVolume(10);
        System.out.println(secondMusicPlayer);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
*/
       // firstMusicPlayer.playMusic();
       // System.out.println(firstMusicPlayer.getName());
       // System.out.println(firstMusicPlayer.getVolume());
        context.close();
    }
}
