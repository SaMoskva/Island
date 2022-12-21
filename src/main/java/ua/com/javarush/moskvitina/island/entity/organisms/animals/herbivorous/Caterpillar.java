package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;

@SpeciesData(name = "Гусеница", icon = "\uD83D\uDC1B", maxWeight = 0.01, maxQuantityOnCell = 1000, maxSpeed = 0,
        maxFoodNeeded = 0)
public class Caterpillar extends Herbivore{
    public Caterpillar(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
