package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.MaxValue;

@SpeciesData(name = "Кролик", icon = "\uD83D\uDC07", maxWeight = 2, maxQuantityOnCell = 150, maxSpeed = 2,
        maxFoodNeeded = 0.45)
public class Rabbit extends Herbivore{
    public Rabbit(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
