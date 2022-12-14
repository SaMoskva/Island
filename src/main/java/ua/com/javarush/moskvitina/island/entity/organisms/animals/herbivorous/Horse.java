package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.MaxValue;

@SpeciesData(name = "Лошадь", icon = "\uD83D\uDC0E", maxWeight = 400, maxQuantityOnCell = 20, maxSpeed = 4,
        maxFoodNeeded = 60)
public class Horse extends Herbivore{
    public Horse(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
