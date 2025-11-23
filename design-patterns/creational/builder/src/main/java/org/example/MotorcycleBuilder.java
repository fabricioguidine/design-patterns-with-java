package org.example;

/**
 * Builder class for constructing Motorcycle objects step by step.
 * Implements the Builder pattern to create complex objects with validation.
 * 
 * @version 1.0
 */
public class MotorcycleBuilder {
    private Motorcycle motorcycle;

    /**
     * Constructs a new MotorcycleBuilder.
     */
    public MotorcycleBuilder() {
        motorcycle = new Motorcycle();
    }

    /**
     * Builds and validates the motorcycle.
     * 
     * @return the constructed Motorcycle
     * @throws IllegalArgumentException if required fields are missing or invalid
     */
    public Motorcycle build() {
        if (motorcycle.getBrand() == null || motorcycle.getBrand().isEmpty()) {
            throw new IllegalArgumentException("Invalid brand.");
        }
        if (motorcycle.getModel() == null || motorcycle.getModel().isEmpty()) {
            throw new IllegalArgumentException("Invalid model.");
        }
        if (motorcycle.getYear() == 0) {
            throw new IllegalArgumentException("Invalid year.");
        }
        return motorcycle;
    }

    public MotorcycleBuilder setBrand(String brand) {
        motorcycle.setBrand(brand);
        return this;
    }

    public MotorcycleBuilder setModel(String model) {
        motorcycle.setModel(model);
        return this;
    }

    public MotorcycleBuilder setYear(int year) {
        motorcycle.setYear(year);
        return this;
    }

    public MotorcycleBuilder setColor(String color) {
        motorcycle.setColor(color);
        return this;
    }

    public MotorcycleBuilder setDisplacement(String displacement) {
        motorcycle.setDisplacement(displacement);
        return this;
    }

    public MotorcycleBuilder setPower(String power) {
        motorcycle.setPower(power);
        return this;
    }

    public MotorcycleBuilder setChassis(String chassis) {
        motorcycle.setChassis(chassis);
        return this;
    }

    public MotorcycleBuilder setLicensePlate(String licensePlate) {
        motorcycle.setLicensePlate(licensePlate);
        return this;
    }

    public MotorcycleBuilder setEngineType(int engineType) {
        motorcycle.setEngineType(engineType);
        return this;
    }

    public MotorcycleBuilder setPrice(float price) {
        motorcycle.setPrice(price);
        return this;
    }
}

