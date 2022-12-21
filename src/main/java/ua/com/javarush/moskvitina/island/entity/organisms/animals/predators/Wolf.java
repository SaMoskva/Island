package ua.com.javarush.moskvitina.island.entity.organisms.animals.predators;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;

@SpeciesData(name = "Волк", icon = "\uD83D\uDC3A", maxWeight = 50, maxQuantityOnCell = 30, maxSpeed = 3,
        maxFoodNeeded = 8)
public class Wolf extends Predator{
    public Wolf(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }

}
