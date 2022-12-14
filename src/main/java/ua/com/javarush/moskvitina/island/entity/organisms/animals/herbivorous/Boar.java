package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.abstraction.annotation.SpeciesData;
import ua.com.javarush.moskvitina.island.entity.MaxValue;

@SpeciesData(name = "Кабан", icon = "\uD83D\uDC17", maxWeight = 400, maxQuantityOnCell = 50, maxSpeed = 2,
             maxFoodNeeded = 50)
public class Boar extends Herbivore{
    public Boar(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
