package com.designpattern.structural.bridge.demo.formatter;

import java.util.List;

/**
 * PrintFormatter - a concrete implementation of Formatter bridge
 * NB: You can have as much concrete impl as you want
 * depending on your use case. e.g. Html Formatter with its own
 * unique format too
 */
public class PrintFormatter implements Formatter{
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder(20);
        builder.append(header);
        builder.append("\n");
        for (Detail detail : details){
            builder.append(detail.getLabel());
            builder.append(" : ");
            builder.append(detail.getValue());
            builder.append("\n");
        }

        return builder.toString();
    }
}
