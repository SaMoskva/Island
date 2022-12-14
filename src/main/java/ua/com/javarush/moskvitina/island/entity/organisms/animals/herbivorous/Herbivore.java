package ua.com.javarush.moskvitina.island.entity.organisms.animals.herbivorous;

import ua.com.javarush.moskvitina.island.entity.MaxValue;
import ua.com.javarush.moskvitina.island.entity.organisms.animals.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }
}
