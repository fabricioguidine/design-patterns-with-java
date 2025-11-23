package org.example;

/**
 * Abstract character class that uses the Bridge pattern.
 * Separates the abstraction (CharacterClass) from the implementation (Race).
 * 
 * @version 1.0
 */
public abstract class CharacterClass {
    protected Race race;
    protected float value;

    public CharacterClass(float value) {
        this.value = value;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public abstract float calculateValue();
}

