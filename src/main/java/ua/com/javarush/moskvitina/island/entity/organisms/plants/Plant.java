package ua.com.javarush.moskvitina.island.entity.organisms.plants;

import ua.com.javarush.moskvitina.island.entity.organisms.MaxValue;
import ua.com.javarush.moskvitina.island.entity.organisms.Organism;

public class Plant extends Organism {
    public Plant(String name, String icon, MaxValue max) {
        super(name, icon, max);
    }

    @Override
    public boolean spawn() {
        return false;
    }
}
