package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.MaxValue;

@SpeciesData(name = "Утка", icon = "\uD83E\uDD86", maxWeight = 1, maxQuantityOnCell = 200, maxSpeed = 4,
        maxFoodNeeded = 0.15)
public class Duck extends Herbivore{
    public Duck(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
