package com.designpattern.behavioural.strategy.demo;

/**
 * CreditCard class - using strategy pattern blueprint.
 * the validation strategy will be determined
 * by client using strategy pattern logic
 */
public class CreditCard {
    private final CreditCardValidationStrategy validationStrategy;
    private String number;
    private String date;
    private String cvv;

    public CreditCard(CreditCardValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    /**
     * this is how to swap out strategy at
     * runtime without things being hardcoded.
     * as you see, the validation logic itself
     * is externalized from this class thus
     * enhancing loose coupling
     *
     * @return boolean
     */
    public boolean isValid() {
        return validationStrategy.isValid(this);
    }
}
