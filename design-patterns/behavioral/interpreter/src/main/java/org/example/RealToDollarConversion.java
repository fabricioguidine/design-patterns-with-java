package org.example;

/**
 * Converts Brazilian Real to US Dollar using exchange rate calculation.
 * 
 * @version 1.0
 */
public class RealToDollarConversion {
    private double value;
    private double rate;

    /**
     * Gets the value in Brazilian Real.
     * 
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value in Brazilian Real.
     * 
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the exchange rate.
     * 
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * Sets the exchange rate.
     * 
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Calculates the converted value.
     * 
     * @return the calculated conversion value
     */
    public double calculateValue() {
        return ExchangeRate.calculateValue(this.value, this.rate / this.value);
    }
}

