package com.designpattern.behavioural.interpreter;

import com.designpattern.behavioural.interpreter.demo.AndExpression;
import com.designpattern.behavioural.interpreter.demo.Expression;
import com.designpattern.behavioural.interpreter.demo.OrExpression;
import com.designpattern.behavioural.interpreter.demo.TerminalExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterPatternDemo {
    /**
     * builds required interpreter tree
     * @return
     */
    static Expression buildInterpreterTree(){
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        //Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        //Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal3, alternation1);

        return new AndExpression(terminal3, alternation2);
    }

    /**
     * main method - build the interpreter and
     * then interprets a specific sequence
     * @param args
     */
    public static void main(String[] args) {
//        everydayDemoWithPattern();
//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Lions Tigers";
        String context = "Lions Bears";
//        String context = "Tigers Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));

    }

    private static void everydayDemoWithPattern(){
        String input = "Lions, and tigers, and bears! Oh, my!";

        //NB: pattern case matters, so Lion is not the same as lion
        Pattern pattern = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Found a " + matcher.group() + ".");
        }
    }
}
