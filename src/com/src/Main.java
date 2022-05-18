package com.src;

import com.src.uicontrol.Button;
import com.src.uicontrol.CheckBox;
import com.src.uicontrol.TextBox;
import com.src.uicontrol.UIControl;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello World!");
//        var taxCalculator = getCalculator();
//        taxCalculator.calculateTax();

        //demonstrate inheritance
        var checkBox = new CheckBox();
        checkBox.enable();

        //demonstrate polymorphism
        drawUIControl(new CheckBox()); //draws a checkbox
        drawUIControl(new TextBox()); //draws a text box
        drawUIControl(new Button()); //draws a button
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

    public static void drawUIControl(UIControl uiControl){
        uiControl.draw();
    }
}
