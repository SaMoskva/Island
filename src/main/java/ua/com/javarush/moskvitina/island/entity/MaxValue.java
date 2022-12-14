package ua.com.javarush.moskvitina.island.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MaxValue {
    private final int maxQuantityOnCell;
    private final int maxSpeed;
    private final double maxWeight;
    private final double maxFoodNeeded;
}
