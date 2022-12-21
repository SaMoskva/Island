package ua.com.javarush.moskvitina.island.entity.organisms;

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
    public boolean add(Organism organism) {
        return organisms.add(organism);
    }

    public Stream<Organism> stream() {
        return organisms.stream();
    }
}