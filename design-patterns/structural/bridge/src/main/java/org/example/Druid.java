package org.example;

/**
 * Druid character class implementation.
 * 
 * @version 1.0
 */
public class Druid extends CharacterClass {

    public Druid(float value) {
        super(value);
    }

    @Override
    public float calculateValue() {
        return this.value + this.race.getPurchaseValue();
    }
}

