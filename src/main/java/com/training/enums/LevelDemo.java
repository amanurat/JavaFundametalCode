package com.training.enums;

enum Level {
    HIGH, MEDIUM, LOW
}

public class LevelDemo {

    public static void main(String[] args) {

        Level level = Level.HIGH;

        if (level == Level.HIGH) {
            System.out.println("Level is very High");
        } else if (level == Level.MEDIUM) {
            System.out.println("Level is medium");
        } else if (level == Level.LOW) {
            System.out.println("Level is very low");
        }

        System.out.println("======= For ========");

        for (Level l : Level.values()) {
            System.out.println(l);
        }

    }

}





