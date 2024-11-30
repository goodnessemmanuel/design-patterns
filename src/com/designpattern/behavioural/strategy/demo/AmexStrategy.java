package com.designpattern.behavioural.strategy.demo;

public class AmexStrategy extends CreditCardValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = creditCard.getNumber().startsWith("37") ||
                creditCard.getNumber().startsWith("34");

        if (isValid) isValid = creditCard.getNumber().length() == 15;

        if (isValid) isValid = isLuhnCompliant(creditCard.getNumber());

        return isValid;
    }
}
