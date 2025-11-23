package org.example;

/**
 * Chest decoration for motorcycles in the Decorator pattern.
 * 
 * @version 1.0
 */
public class Chest extends MotorcycleDecorator {

    /**
     * Constructs a Chest decorator for the given motorcycle.
     * 
     * @param motorcycle the motorcycle to decorate
     */
    public Chest(Motorcycle motorcycle) {
        super(motorcycle);
    }

    @Override
    public float getPartPrice() {
        return 2000;
    }

    @Override
    public String getPartCustom() {
        return "Chest";
    }
}

