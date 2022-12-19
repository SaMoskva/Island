package ua.com.javarush.moskvitina.island.entity.organisms;

import ua.com.javarush.moskvitina.island.entity.MaxValue;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Organisms {
    private final Set<Organism> organisms = new LinkedHashSet<>();
    private MaxValue maxValue;
    private String icon = "";

    public String getIcon() {
        return icon;
    }

    public MaxValue getMaxValue() {
        return maxValue;
    }

    public int size(){
        return organisms.size();
    }

    public void addAll(Set<Organism> newOrganisms) {
        organisms.addAll(newOrganisms);
    }

    public Stream<Organism> stream() {
        return organisms.stream();
    }
}