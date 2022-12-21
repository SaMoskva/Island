package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;

@SpeciesData(name = "Овца", icon = "\uD83D\uDC11", maxWeight = 70, maxQuantityOnCell = 140, maxSpeed = 3,
        maxFoodNeeded = 15)
public class Sheep extends Herbivore{
    public Sheep(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
