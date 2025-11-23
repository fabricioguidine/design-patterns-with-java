package org.example;

/**
 * Cleric character class implementation.
 * 
 * @version 1.0
 */
public class Cleric extends CharacterClass {

    public Cleric(float value) {
        super(value);
    }

    @Override
    public float calculateValue() {
        return this.value + this.race.getPurchaseValue();
    }
}

