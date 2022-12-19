package ua.com.javarush.moskvitina.island.util;

import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {

    private Randomizer(){

    }

    public static int getRandomValue(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static double getRandomValue(double min, double max){
        return Math.round(ThreadLocalRandom.current().nextDouble(min, max + 1) * 100.0) / 100.0;
    }

    public static boolean get(int percentProbably) {
        return getRandomValue(0, 100) < percentProbably;
    }

}
