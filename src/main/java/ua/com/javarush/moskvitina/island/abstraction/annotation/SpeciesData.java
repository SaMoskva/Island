package ua.com.javarush.moskvitina.island.abstraction.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SpeciesData {
    String name();
    String icon();
    double maxWeight();
    int maxQuantityOnCell();
    int maxSpeed();
    double maxFoodNeeded();

}
