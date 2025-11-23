package org.example;

/**
 * Abstract decorator class for motorcycles in the Decorator pattern.
 * 
 * @version 1.0
 */
public abstract class MotorcycleDecorator implements Motorcycle {
    protected Motorcycle motorcycle;

    /**
     * Constructs a MotorcycleDecorator with the given motorcycle.
     * 
     * @param motorcycle the motorcycle to decorate
     */
    public MotorcycleDecorator(Motorcycle motorcycle) {
        if (motorcycle == null) {
            throw new IllegalArgumentException("Motorcycle cannot be null");
        }
        this.motorcycle = motorcycle;
    }

    @Override
    public float getPrice() {
        return motorcycle.getPrice() + getPartPrice();
    }

    @Override
    public String getCustom() {
        return motorcycle.getCustom() + ", " + getPartCustom();
    }

    /**
     * Gets the price of the decoration part.
     * 
     * @return the part price
     */
    public abstract float getPartPrice();

    /**
     * Gets the customization description of the decoration part.
     * 
     * @return the part customization string
     */
    public abstract String getPartCustom();
}

