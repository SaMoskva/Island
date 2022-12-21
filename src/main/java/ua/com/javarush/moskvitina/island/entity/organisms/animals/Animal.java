package ua.com.javarush.moskvitina.island.entity.organisms.animals;

import ua.com.javarush.moskvitina.island.abstraction.entity.Eating;
import ua.com.javarush.moskvitina.island.abstraction.entity.Movable;
import ua.com.javarush.moskvitina.island.abstraction.entity.Reproducible;
import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;
import ua.com.javarush.moskvitina.island.entity.organisms.Organism;

public abstract class Animal
        extends Organism
        implements Eating, Movable, Reproducible {
    public Animal(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }

    @Override
    public boolean eat() {
        return true;
    } //TODO

    @Override
    public boolean move() {
        return true;
    } //TODO

    @Override
    public boolean spawn() {
        return true;
    } //TODO
}
