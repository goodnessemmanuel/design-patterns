package com.designpattern.structural.bridge.demo.formatter;

import java.util.List;

/**
 * Formatter - 1st bridge
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}
