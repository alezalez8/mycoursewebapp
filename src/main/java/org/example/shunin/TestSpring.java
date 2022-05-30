package org.example.shunin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");*/

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);


       // ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
       // System.out.println(music.getSong());
        //  System.out.println(music.getVolume());
      //  System.out.println(music.getName());


        context.close();
    }
}
