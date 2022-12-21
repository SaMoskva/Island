package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;

@SpeciesData(name = "Коза", icon = "\uD83D\uDC10", maxWeight = 60, maxQuantityOnCell = 140, maxSpeed = 3,
        maxFoodNeeded = 10)
public class Goat extends Herbivore{
    public Goat(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
