package com.designpattern.behavioural.strategy.demo;

public abstract class CreditCardValidationStrategy {
    public abstract boolean isValid(CreditCard creditCard);

    /**
     * luhn logic is used on most credit validation
     * to eliminate auto generated card easily.
     * logic is here because it is a common functionality
     * that will be thasame for all credit cards strategy
     * @param cardNumber
     * @return
     */
    protected boolean isLuhnCompliant(String cardNumber){
        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if(alternate){
                n *= 2;
                if(n > 9){
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }

        return (sum % 10 == 0);
    }
}
