package ua.com.javarush.moskvitina.island.entity.organisms.animals.predators;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;

@SpeciesData(name = "Лиса", icon = "\uD83E\uDD8A", maxWeight = 8, maxQuantityOnCell = 30, maxSpeed = 2,
        maxFoodNeeded = 2)
public class Fox extends Predator{
    public Fox(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
