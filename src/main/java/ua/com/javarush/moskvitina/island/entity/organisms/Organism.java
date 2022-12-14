package ua.com.javarush.moskvitina.island.entity.organisms;

import ua.com.javarush.moskvitina.island.entity.MaxValue;
import ua.com.javarush.moskvitina.island.entity.map.Cell;
import ua.com.javarush.moskvitina.island.util.Randomizer;

public abstract class Organism {
    private String name;
    private String icon;
    private double weight;

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
}
