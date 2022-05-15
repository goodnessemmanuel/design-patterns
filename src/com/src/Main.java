package com.src;

import com.src.uicontrol.CheckBox;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello World!");
//        var taxCalculator = getCalculator();
//        taxCalculator.calculateTax();

        //demonstrate inheritance
        var checkBox = new CheckBox();
        checkBox.enable();
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
