package com.designpattern.structural.bridge.demo.formatter;

import java.util.List;

/**
 * Printer - 2nd bridge
 */
public abstract class Printer {

    public String print(Formatter formatter){
       return formatter.format(getHeader(), getDetails());
    }

   protected abstract List<Detail> getDetails();

   protected abstract String getHeader();

}
