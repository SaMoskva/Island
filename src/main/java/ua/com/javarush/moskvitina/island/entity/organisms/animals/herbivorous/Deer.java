package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;

@SpeciesData(name = "Олень", icon = "\uD83E\uDD8C", maxWeight = 300, maxQuantityOnCell = 20, maxSpeed = 4,
        maxFoodNeeded = 50)
public class Deer extends Herbivore {
    public Deer(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
