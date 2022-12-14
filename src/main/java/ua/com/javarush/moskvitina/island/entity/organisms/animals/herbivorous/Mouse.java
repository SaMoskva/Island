package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.MaxValue;

@SpeciesData(name = "Мышь", icon = "\uD83D\uDC01", maxWeight = 0.05, maxQuantityOnCell = 500, maxSpeed = 1,
        maxFoodNeeded = 0.01)
public class Mouse extends Herbivore{
    public Mouse(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
