package com.src.builder;

/**
 * This pattern helps to reduce creation of too
 * many overloaded constructors.
 *
 * This also offers the flexibility of entering
 * a certain field at any point in your program
 * as builder does not impose that all member fields
 * are entered at once unlike in constructors where
 * you need to enter all the required constructor
 * parameters before the target object can be created
 * or instantiated.
 */
public class LaunchOrder {
    private String bread;
    private String meat;
    private String sausage;
    private String drink;

    private LaunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.sausage = builder.sausage;
        this.drink = builder.drink;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getSausage() {
        return sausage;
    }

    public String getDrink() {
        return drink;
    }

    public static class Builder {
        private String bread;
        private String meat;
        private String sausage;
        private String drink;

        public LaunchOrder build(){
            return new LaunchOrder(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        public Builder sausage(String sausage){
            this.sausage = sausage;
            return this;
        }

        public Builder drink(String drink){
            this.drink = drink;
            return this;
        }
    }
}
