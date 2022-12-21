package ua.com.javarush.moskvitina.island.entity.map;

import ua.com.javarush.moskvitina.island.entity.organisms.Organisms;
import ua.com.javarush.moskvitina.island.util.Randomizer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Creatures extends LinkedHashMap<String, Organisms>{
    public final Cell cell;

    private static final int PERCENT_RANDOM_ROTATE = 1;

    public Creatures(Cell cell) {
        this.cell = cell;
    }

    public void randomRotate(){
        if (Randomizer.getRandomValue(PERCENT_RANDOM_ROTATE) && size() > 1) {
            synchronized (this) {
                Set<Map.Entry<String, Organisms>> entrySet = entrySet();
                var iterator = entrySet.iterator();
                if(iterator.hasNext()){
                    var organisms = iterator.next();
                    iterator.remove();
                    put(organisms.getKey(), organisms.getValue());
                }

            }
        }
    }
}

