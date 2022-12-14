package ua.com.javarush.moskvitina.island.entity.organisms.animals.predators;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.MaxValue;

@SpeciesData(name = "Медведь", icon = "\uD83D\uDC3B", maxWeight = 500, maxQuantityOnCell = 5, maxSpeed = 2,
        maxFoodNeeded = 80)
public class Bear extends Predator{
    public Bear(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
