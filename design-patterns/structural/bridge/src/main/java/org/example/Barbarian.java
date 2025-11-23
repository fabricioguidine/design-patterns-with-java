package org.example;

/**
 * Barbarian character class implementation.
 * 
 * @version 1.0
 */
public class Barbarian extends CharacterClass {

    public Barbarian(float value) {
        super(value);
    }

    @Override
    public float calculateValue() {
        return this.value + this.race.getPurchaseValue();
    }
}

