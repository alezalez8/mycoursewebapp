package org.example.shunin;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {

    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public void doMyInit() {
        System.out.println("Doing my init");
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyDestroy() {
        System.out.println("Doing my destraction");

    }


}
