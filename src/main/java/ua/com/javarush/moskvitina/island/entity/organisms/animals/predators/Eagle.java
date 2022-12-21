package ua.com.javarush.moskvitina.island.entity.organisms.animals.predators;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;

@SpeciesData(name = "Орёл", icon = "\uD83E\uDD85", maxWeight = 6, maxQuantityOnCell = 20, maxSpeed = 3,
        maxFoodNeeded = 1)
public class Eagle extends Predator{
    public Eagle(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
