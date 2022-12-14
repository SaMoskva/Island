package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.MaxValue;

@SpeciesData(name = "Буйвол", icon = "\uD83D\uDC03", maxWeight = 700, maxQuantityOnCell = 10, maxSpeed = 3,
        maxFoodNeeded = 100)
public class Buffalo extends Herbivore{
    public Buffalo(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
