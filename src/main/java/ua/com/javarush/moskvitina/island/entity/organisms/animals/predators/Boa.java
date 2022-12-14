package ua.com.javarush.moskvitina.island.entity.organisms.animals.predators;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.MaxValue;

@SpeciesData(name = "Удав", icon = "\uD83D\uDC0D", maxWeight = 15, maxQuantityOnCell = 30, maxSpeed = 1,
        maxFoodNeeded = 3)
public class Boa extends Predator{
    public Boa(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
