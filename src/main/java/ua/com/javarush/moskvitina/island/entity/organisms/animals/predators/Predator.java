package ua.com.javarush.moskvitina.island.entity.organisms.animals.predators;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;
import ua.com.javarush.moskvitina.island.entity.organisms.animals.Animal;

@SpeciesData(name = "Коза", icon = "\uD83D\uDC10", maxWeight = 60, maxQuantityOnCell = 140, maxSpeed = 3,
        maxFoodNeeded = 10)
public abstract class Predator extends Animal {
    public Predator(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
