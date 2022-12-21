package ua.com.javarush.moskvitina.island.entity.organisms;

import ua.com.javarush.moskvitina.island.abstraction.entity.Reproducible;
import ua.com.javarush.moskvitina.island.entity.map.Cell;
import ua.com.javarush.moskvitina.island.util.Randomizer;

import java.util.concurrent.atomic.AtomicLong;

public abstract class Organism implements Reproducible, Cloneable {
    private final static AtomicLong idCounter = new AtomicLong(System.currentTimeMillis());
    private final String name;
    private final String icon;
    private double weight;
    private final MaxValue maxValue;
    private long id = idCounter.incrementAndGet();

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Organism(String name, String icon, MaxValue max) {
        this.name = name;
        this.icon = icon;
        this.maxValue = max;
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
    protected Organism clone() throws CloneNotSupportedException{
        Organism clone = (Organism) super.clone();
        clone.id = idCounter.incrementAndGet();
        clone.weight = Randomizer.getRandomValue(maxValue.getMaxWeight() / 2, maxValue.getMaxWeight());
        return clone;
    }

    public static <T extends Organism> T clone(T original) {
        //for clients (cast to original Type)
        try {
            return (T) original.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }

    }

    private final String type = this
            .getClass()
            .getSimpleName();

    public String getType() {
        return type;
    }

    public MaxValue getMaxValue() {
        return maxValue;
    }

    //TODO create method for finding food in the cell
}
