package ua.com.javarush.moskvitina.island.entity.organisms;

import ua.com.javarush.moskvitina.island.abstraction.entity.Reproducible;
import ua.com.javarush.moskvitina.island.entity.MaxValue;
import ua.com.javarush.moskvitina.island.entity.map.Cell;
import ua.com.javarush.moskvitina.island.util.Randomizer;

public abstract class Organism implements Reproducible, Cloneable {
    private final String name;
    private final String icon;
    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Organism(String name, String icon, MaxValue max) {
        this.name = name;
        this.icon = icon;
        this.weight = Randomizer.getRandomValue(max.getMaxWeight() / 2, max.getMaxWeight());
    }

    protected boolean die(Cell targetCell){
        return true;
    }

    protected boolean changeWeight(){
        return true;
    }

    public String toString() {
        return icon + " " + name + " весом " + weight;
    }

    @Override
    public Organism clone() {
        try {
            Organism clone = (Organism) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
