package ua.com.javarush.moskvitina.island.abstraction.entity;

@FunctionalInterface
public interface Reproducible {
    boolean spawn(); //TODO use a cell as a parameter
}
