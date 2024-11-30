package com.designpattern.behavioural.strategy.demo;

public class VisaStrategy extends CreditCardValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = creditCard.getNumber().startsWith("4");

        if (isValid) isValid = creditCard.getNumber().length() == 16;

        if (isValid) isValid = isLuhnCompliant(creditCard.getNumber());

        return isValid;
    }
}
