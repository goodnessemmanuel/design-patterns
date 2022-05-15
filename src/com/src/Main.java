package com.src;

import com.src.account.Account;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        var taxCalculator = getCalculator();
//        taxCalculator.calculateTax();

        var account = new Account();
        account.deposit(100);
        account.withdraw(60);
        System.out.println(account.getBalance());
    }

    /**programming to interface
     * TaxCalculator type here is an interface
     * which is used to achieve loose coupling
     * you can decide which particular implementation
     * of tax calculator you want to use e.g. 2019, 2020
     * @return
     */
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
