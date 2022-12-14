package ua.com.javarush.moskvitina.island.entity.map;

import ua.com.javarush.moskvitina.island.entity.organisms.Organism;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell {

    private final int column;
    private final int row;

    private final List<Organism> organisms;

    public Cell(int column, int row) {
        this.column = column;
        this.row = row;
        this.organisms = new CopyOnWriteArrayList<>();
    }

    public void addOrganism (Organism organism){
        this.organisms.add(organism);
    }

    public void removeOrganism (Organism organism){
        this.organisms.remove(organism);
    }
}
